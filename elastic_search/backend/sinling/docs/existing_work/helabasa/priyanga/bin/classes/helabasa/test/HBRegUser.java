 p a c k a g e   h e l a b a s a . t e s t ;  
  
 i m p o r t   h e l a b a s a . H B U s e r ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . U s e r D a t a b a s e ;  
  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
  
 p u b l i c   c l a s s   H B R e g U s e r   {  
  
 	 p u b l i c   H B R e g U s e r ( )   {  
 	 	  
 	 }  
  
 	 / * *  
 	   *   @ p a r a m   a r g s  
 	   * /  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	  
 	 	 i f ( a r g s . l e n g t h   ! =   3 )  
 	 	 {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " U s a g e   :   H B R e g U S e r   < U s e r n a m e >   < P a s s w o r d >   < R o l e > " ) ; 	 	 	  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 H e l a b a s a . S e t L o g ( n e w   P r i n t W r i t e r ( S y s t e m . o u t ,   t r u e ) ) ;  
 	 	 	  
 	 	 	 S t r i n g   s U s e r n a m e   =   a r g s [ 0 ] ;  
 	 	 	 S t r i n g   s P w d   =   a r g s [ 1 ] ;  
 	 	 	 S t r i n g   s R o l e I D   =   a r g s [ 2 ] ; 	 	 	  
 	 	 	 s h o r t   i R o l e I D   =   S h o r t . p a r s e S h o r t ( s R o l e I D ) ;  
 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " R e g i s t e r i n g   U s e r   :   U = "   +   s U s e r n a m e   +   "   :   P = "   +   s P w d   +   "   :   R = "   +   i R o l e I D ) ;  
 	 	 	 H B U s e r   o U s e r   =   U s e r D a t a b a s e . R e g i s t e r U s e r ( s U s e r n a m e ,   s P w d ,   i R o l e I D ) ;  
 	 	 	 i f ( o U s e r = = n u l l )  
 	 	 	 {  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " U s e r   R e g i s t e r i n g   F a i l e d ! " ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " U s e r   R e g i s t e r e d   S u c c e s s f u l l y   :   U I D = "   +   o U s e r . G e t U s e r I D ( ) ) ;  
 	 	 	 }  
 	 	 } 	 	  
  
 	 }  
  
 }  
