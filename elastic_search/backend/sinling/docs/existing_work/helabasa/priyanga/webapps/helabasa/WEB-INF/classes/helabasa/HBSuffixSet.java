 p a c k a g e   h e l a b a s a ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
 i m p o r t   j a v a . u t i l . M a p ;  
  
 p u b l i c   c l a s s   H B S u f f i x S e t   {  
  
 	  
 	 p r i v a t e   L i s t < H B W o r d >   l i s t _ J o i n S u f f i x e s   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 p r i v a t e   M a p < S t r i n g ,   H B W o r d >   m a p _ J o i n S u f f i x e s   =   n e w   H a s h M a p < S t r i n g ,   H B W o r d > ( ) ;  
 	  
 	 p r i v a t e   L i s t < H B W o r d >   l i s t _ A p p e n d S u f f i x e s   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 p r i v a t e   M a p < S t r i n g ,   H B W o r d >   m a p _ A p p e n d S u f f i x e s   =   n e w   H a s h M a p < S t r i n g ,   H B W o r d > ( ) ; 	  
 	  
 	 p u b l i c   H B S u f f i x S e t ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
  
 	 p u b l i c   L i s t < H B W o r d >   G e t J o i n S u f f i x L i s t ( )  
 	 {  
 	 	 r e t u r n   l i s t _ J o i n S u f f i x e s ;  
 	 }  
  
 	 p u b l i c   L i s t < H B W o r d >   G e t A p p e n d S u f f i x L i s t ( )  
 	 {  
 	 	 r e t u r n   l i s t _ A p p e n d S u f f i x e s ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t J o i n S u f f i x C o u n t ( )  
 	 {  
 	 	 r e t u r n   l i s t _ J o i n S u f f i x e s . s i z e ( ) ;  
 	 }  
 	  
 	 p u b l i c   H B W o r d   G e t J o i n S u f f i x ( i n t   i P o s )  
 	 {  
 	 	 r e t u r n   l i s t _ J o i n S u f f i x e s . g e t ( i P o s ) ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t A p p e n d S u f f i x C o u n t ( )  
 	 {  
 	 	 r e t u r n   l i s t _ A p p e n d S u f f i x e s . s i z e ( ) ;  
 	 }  
 	  
 	 p u b l i c   H B W o r d   G e t A p p e n d S u f f i x ( i n t   i P o s )  
 	 {  
 	 	 r e t u r n   l i s t _ A p p e n d S u f f i x e s . g e t ( i P o s ) ;  
 	 } 	  
 	  
 	 p u b l i c   v o i d   A d d S u f f i x ( H B T r a n s f o r m R u l e   o R u l e )  
 	 {  
 	 	 i f ( o R u l e . G e t S u f f i x ( ) . G e t N a t u r a l C h a r a c t e r C o u n t ( ) = = 0 )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " H B S u f f i x S e t : : A d d S u f f i x   :   E m p t y   S u f f i x   I g n o r e d   :   T = "   +   o R u l e . G e t T y p e ( )   +   "   :   S T = "   +   o R u l e . G e t S u b T y p e ( ) ) ;  
 	 	 }  
 	 	 e l s e   i f ( o R u l e . G e t J o i n M e t h o d ( ) = = H B T r a n s f o r m R u l e . H B T R _ J O I N )  
 	 	 {  
 	 	 	 S t r i n g   s S u f f i x   =   o R u l e . G e t S u f f i x ( ) . G e t N a t u r a l F o r m ( ) ;  
 	 	 	  
 	 	 	 i f ( m a p _ J o i n S u f f i x e s . c o n t a i n s K e y ( s S u f f i x )   = =   f a l s e )  
 	 	 	 {  
 	 	 	 	 l i s t _ J o i n S u f f i x e s . a d d ( o R u l e . G e t S u f f i x ( ) ) ;  
 	 	 	 	 m a p _ J o i n S u f f i x e s . p u t ( s S u f f i x ,   o R u l e . G e t S u f f i x ( ) ) ;  
 	 	 	 }  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 S t r i n g   s S u f f i x   =   o R u l e . G e t S u f f i x ( ) . G e t N a t u r a l F o r m ( ) ;  
 	 	 	  
 	 	 	 i f ( m a p _ A p p e n d S u f f i x e s . c o n t a i n s K e y ( s S u f f i x )   = =   f a l s e )  
 	 	 	 {  
 	 	 	 	 l i s t _ A p p e n d S u f f i x e s . a d d ( o R u l e . G e t S u f f i x ( ) ) ;  
 	 	 	 	 m a p _ A p p e n d S u f f i x e s . p u t ( s S u f f i x ,   o R u l e . G e t S u f f i x ( ) ) ;  
 	 	 	 } 	 	 	 	 	  
 	 	 } 	  
 	 }  
  
 	 p u b l i c   v o i d   D e b u g P r i n t ( )  
 	 {  
 	 	 i n t   i A p p e n d S u f f i x C o u n t   =   l i s t _ A p p e n d S u f f i x e s . s i z e ( ) ;  
 	 	  
 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " H B S u f f i x S e t :   A P P P E N D   S u f f i x   C o u n t = "   +   i A p p e n d S u f f i x C o u n t ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i A p p e n d S u f f i x C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " A P N D [ "   +   i   +   " ] = "   +   l i s t _ A p p e n d S u f f i x e s . g e t ( i ) . G e t N a t u r a l F o r m ( ) ) ;  
 	 	 }  
 	 	  
 	 	 i n t   i J o i n S u f f i x C o u n t   =   l i s t _ J o i n S u f f i x e s . s i z e ( ) ;  
 	 	  
 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " H B S u f f i x S e t :   J O I N   S u f f i x   C o u n t = "   +   i A p p e n d S u f f i x C o u n t ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i J o i n S u f f i x C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " J O I N [ "   +   i   +   " ] = "   +   l i s t _ J o i n S u f f i x e s . g e t ( i ) . G e t N a t u r a l F o r m ( ) ) ;  
 	 	 } 	 	 	  
 	 }  
 	  
 	  
 }  
