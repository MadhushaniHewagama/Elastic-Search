 p a c k a g e   h e l a b a s a . s e r v l e t s . u t i l s ;  
  
 i m p o r t   j a v a . s q l . C o n n e c t i o n ;  
 i m p o r t   j a v a . s q l . R e s u l t S e t ;  
 i m p o r t   j a v a . s q l . S t a t e m e n t ;  
  
 i m p o r t   h e l a b a s a . H B U s e r ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . u t i l s . H B D a t a b a s e ;  
  
 p u b l i c   c l a s s   U s e r D a t a b a s e   e x t e n d s   H B D a t a b a s e {  
  
 	 p u b l i c   U s e r D a t a b a s e ( )   {  
  
 	 }  
  
 	 p u b l i c   s t a t i c   H B U s e r   G e t U s e r ( S t r i n g   s U s e r n a m e )  
 	 { 	 	  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   n u l l ;  
 	 	 }  
 	 	 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 S t r i n g   s S Q L   =   " s e l e c t   u s e r _ n a m e ,   p w d _ h a s h ,   u s e r _ i d ,   u s e r _ r o l e   f r o m   h b _ u s e r s   w h e r e   u s e r _ n a m e = ' "   +   s U s e r n a m e   +   " ' " ; 	 	  
 	 	 	  
 	 	 	 R e s u l t S e t   o R S   =   n u l l ;  
 	 	 	  
 	 	 	 t r y  
 	 	 	 {  
 	 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 	 o R S   =   s Q u e r y . e x e c u t e Q u e r y ( s S Q L ) ;  
 	 	 	 	 	 	  
 	 	 	 	 w h i l e ( o R S . n e x t ( ) )  
 	 	 	 	 { 	  
 	 	 	 	 	 S t r i n g   s P w d H a s h   =   " " ;  
 	 	 	 	 	 s h o r t   i U s e r I D   =   0 ;  
 	 	 	 	 	 s h o r t   i U s e r R o l e   =   0 ; 	  
 	 	 	 	 	 s P w d H a s h   =   o R S . g e t S t r i n g ( " p w d _ h a s h " ) ;  
 	 	 	 	 	 i U s e r I D   =   o R S . g e t S h o r t ( " u s e r _ i d " ) ;  
 	 	 	 	 	 i U s e r R o l e   =   o R S . g e t S h o r t ( " u s e r _ r o l e " ) ;  
 	 	 	 	 	 H B U s e r   o U s e r   =   n e w   H B U s e r ( s U s e r n a m e ,   s P w d H a s h ,   i U s e r I D ,   i U s e r R o l e ) ; 	 	 	 	 	 	 	 	 	 	 	 	 	 	  
 	 	 	 	 	 r e t u r n   o U s e r ;  
 	 	 	 	 } 	 	 	 	 	 	  
 	 	 	 	 o R S . c l o s e ( ) ;  
 	 	 	 }  
 	 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 	 {  
 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   G e t   U s e r   [ "   +   s U s e r n a m e   +   " ]   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 	 } 	 	 	  
 	 	 } 	  
 	 	  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   H B U s e r   R e g i s t e r U s e r ( S t r i n g   s U s e r n a m e ,   S t r i n g   s P w d ,   s h o r t   i R o l e I D )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   n u l l ;  
 	 	 }  
 	 	 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	  
 	 	 S t r i n g   s P w d H a s h   =   W e b U t i l s . M D 5 H a s h ( s P w d ) ;  
 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " P a s s w o r d   H a s h   =   [ "   +   s P w d H a s h   +   " ] " ) ;  
 	 	  
 	 	 S t r i n g   s S Q L   =   " i n s e r t   i n t o   h b _ u s e r s ( u s e r _ n a m e ,   p w d _ h a s h ,   u s e r _ r o l e )   "   +  
 	 	 	 	 " v a l u e s ( ' " +   s U s e r n a m e   +   " ' ,   ' "   +   s P w d H a s h   +   " ' ,   "   +   i R o l e I D   +   " ) " ; 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 s Q u e r y . e x e c u t e ( s S Q L ) ;  
 	 	 	 	 	 	  
 	 	 	 H B U s e r   o U s e r   =   G e t U s e r ( s U s e r n a m e ) ;  
 	 	 	 i f ( o U s e r ! = n u l l )  
 	 	 	 {  
 	 	 	 	 o U s e r . D e b u g P r i n t ( ) ;  
 	 	 	 	 r e t u r n     o U s e r ; 	 	 	 	 	  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   R e g i s t e r i n g   U s e r   [ "   +   s U s e r n a m e   +   " ]   f a i l e d ! " ) ;  
 	 	 	 } 	 	 	  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   R e g i s t e r i n g   U s e r   [ "   +   s U s e r n a m e   +   " ]   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	 	  
 	 	 r e t u r n   n u l l ;  
 	 }  
 }  
