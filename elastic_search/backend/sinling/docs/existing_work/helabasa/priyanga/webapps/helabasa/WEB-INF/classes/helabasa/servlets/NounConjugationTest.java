 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . s e r v l e t s ;  
  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . A d m i n L o g i n ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . H B J o i n T e s t e r ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
  
 p u b l i c   c l a s s   N o u n C o n j u g a t i o n T e s t   e x t e n d s   H t t p S e r v l e t   {  
  
         / * *  
 	   *    
 	   * /  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   6 9 8 5 4 8 6 8 4 5 9 7 9 2 8 9 6 4 1 L ;  
  
 	 p r i v a t e   s t a t i c   S t r i n g   s D e f T e s t D a t a V a l   =   "������ ,� ,������ \ n��� ,��� ,����� " ;  
  
 	 p u b l i c   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
         t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
         {  
 	 	 i f ( A d m i n L o g i n . V e r i f y ( o R e q ,   o R e s ) )  
 	 	 { 	 	  
 	         	 S t r i n g   s D a t a   =   o R e q . g e t P a r a m e t e r ( " t d a t a " ) ;         	  
 	         	                 	  
 	         	 i f ( s D a t a = = n u l l )  
 	         	 {  
 	         	 	 p r i n t P a g e ( o R e q ,   o R e s ,   0 ,   s D e f T e s t D a t a V a l ) ;  
 	         	 }      
 	         	 e l s e   i f ( s D a t a . t r i m ( ) . l e n g t h ( ) = = 0   )  
 	         	 {  
 	         	 	 p r i n t P a g e ( o R e q ,   o R e s ,   1 ,   s D e f T e s t D a t a V a l ) ;  
 	         	 }  
 	         	 e l s e  
 	         	 {  
 	         	 	 s D a t a   =   n e w   S t r i n g   ( s D a t a . g e t B y t e s   ( " i s o - 8 8 5 9 - 1 " ) ,   " U T F - 8 " ) ;  
 	         	 	 / / s D a t a   =   U R L D e c o d e r . d e c o d e ( s D a t a ,   " U T F - 8 " ) ;  
 	         	 	 p r i n t P a g e ( o R e q ,   o R e s ,   2 ,   s D a t a . t r i m ( ) ) ;  
 	         	 }         	         	  
 	 	 }  
         }  
 	  
 	 p u b l i c   v o i d   d o P o s t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
 	 	         t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
         {  
 	 	 d o G e t ( o R e q ,   o R e s ) ;     	  
         } 	  
          
         p r i v a t e   v o i d   p r i n t P a g e ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s ,   i n t   i T y p e ,   S t r i n g   s D a t a )   t h r o w s   I O E x c e p t i o n  
         {  
         	 o R e s . s e t C o n t e n t T y p e ( " t e x t / h t m l " ) ;  
         	 o R e s . s e t C h a r a c t e r E n c o d i n g ( " U T F - 8 " ) ;  
                 P r i n t W r i t e r   o u t   =   o R e s . g e t W r i t e r ( ) ;  
                  
                 H e l a b a s a . S e t L o g ( o u t ) ;  
                  
                 o u t . p r i n t l n ( " < h t m l > < h e a d > < t i t l e > H e l a b a s a   -   S a n d h i   T e s t < / t i t l e > < / h e a d > " ) ;                  
                 o u t . p r i n t l n ( " < s t y l e   t y p e = ' t e x t / c s s ' > a   { t e x t - d e c o r a t i o n : n o n e ; } \ n a : h o v e r   { t e x t - d e c o r a t i o n : u n d e r l i n e ; } \ n < / s t y l e > " ) ;  
                 o u t . p r i n t l n ( " < b o d y   a l i g n = ' c e n t e r ' > < p   a l i g n = ' c e n t e r ' > " ) ;  
                 o u t . p r i n t l n ( " < h 2   a l i g n = ' c e n t e r ' > H e l a b a s a < / h 2 >   < h 3   a l i g n = ' c e n t e r ' > < a   h r e f = ' . / a d m i n _ p a g e ' > S i n h a l a   M o r p h o l o g i c a l   T o o l s   C o l l e c t i o n   -   A d m i n   C o n s o l e < / a > < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > N o u n   C o n j u g a t i o n   T e s t   (���  �� �����  ��������  �������� )   < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < f o r m   i d = ' f n c o n j '   a c t i o n = . / c o n j u g a t i o n _ t e s t   a l i g n = ' c e n t e r '   m e t h o d = ' p o s t '   a c c e p t - c h a r s e t = ' U T F - 8 ' > " ) ;  
                 	 	  
                 o u t . p r i n t l n ( " < t e x t a r e a   n a m e = ' t d a t a '   c o l s = ' 3 0 '   r o w s = ' 1 0 '   w r a p = ' v i r t u a l ' > "   +   s D a t a   +   " < / t e x t a r e a > " ) ;  
                                  
                 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > < i n p u t   t y p e = ' s u b m i t '   v a l u e = ' T e s t '   s t y l e = ' h e i g h t :   2 e m ;   w i d t h :   4 e m ' > < / p > " ) ;  
                                  
                 o u t . p r i n t l n ( " < / f o r m > " ) ;  
  
                 i f ( i T y p e = = 0 )  
                 {  
                 	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > I n p u t   t h e   t e s t   d a t a   i n   [ l e f t ] , [ r i g h t ] , [ j o i n e d ]   f o r m a t . < / p > " ) ;  
                 }  
                 e l s e   i f ( i T y p e = = 1 )  
                 {  
                 	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > T e s t   d a t a   s e t   i s   e m p t y !   I n p u t   t e s t   d a t a   i n   [ l e f t ] , [ r i g h t ] , [ j o i n e d ]   f o r m a t . < / p > " ) ;  
                 }  
                 e l s e  
                 {  
                 	 P r i n t R e s u l t s T a b l e ( o u t ,   s D a t a ) ;  
                 }                  
                  
                 o u t . p r i n t l n ( A d m i n L o g i n . G e t L o g o u t P a n e l ( o R e q ) ) ;      
                  
                 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > �   2 0 1 3   R a j i t h   P r i y a n g a   ( < a   h r e f = ' m a i l t o : r p r i y a n g a @ y a h o o . c o m ' > r p r i y a n g a @ y a h o o . c o m < / a > ) < / p > < / p > " ) ;                  
         }  
          
         p u b l i c   v o i d   P r i n t R e s u l t s T a b l e ( P r i n t W r i t e r   o u t ,   S t r i n g   s D a t a )  
         {  
         	 o u t . p r i n t l n ( " < b r > < h r > < p   a l i g n = ' c e n t e r ' > < h 4   a l i g n = ' c e n t e r ' > R e s u l t s < / h 4 > < / p > " ) ;  
  
         	 H B J o i n T e s t e r   o T e s t e r   =   n e w   H B J o i n T e s t e r ( ) ;  
         	 i n t   i C o u n t   =   L o a d T e s t D a t a ( o T e s t e r ,   s D a t a ) ;  
         	  
         	 i f ( i C o u n t = = 0 )  
         	 {  
         	 	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > < h 4   a l i g n = ' c e n t e r ' > N o t h i n g   t o   J o i n !   I n p u t   t e s t   d a t a   i n   [ l e f t ] , [ r i g h t ] , [ j o i n e d ]   f o r m a t . < / h 4 > < / p > " ) ;  
         	 }  
         	 e l s e  
         	 {  
 	         	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > < h 4   a l i g n = ' c e n t e r ' > J o i n i n g   "   +   i C o u n t   +   "   p a i r s   o f   w o r d s   . . .   < / h 4 > < / p > " ) ;  
 	         	  
 	         	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > < f o r m   i d = ' f r e s u l t '   a l i g n = ' c e n t e r ' > < t e x t a r e a   n a m e = ' t r e s u l t '   i d = ' t r e s u l t '   c o l s = ' 1 0 0 '   r o w s = ' 5 0 '   w r a p = ' v i r t u a l '   r e a d o n l y > " ) ;         	  
 	         	 o T e s t e r . T e s t ( ) ; 	         	  
 	 	 	 o u t . p r i n t l n ( " < / t e x t a r e a > < / f o r m > < / p > " ) ;  
         	 }  
         }  
          
         p r i v a t e   i n t   L o a d T e s t D a t a ( H B J o i n T e s t e r   o T e s t e r ,   S t r i n g   s D a t a )  
         {  
 	 	 S t r i n g   c v s S p l i t B y   =   " \ n " ;  
                 S t r i n g [ ]   a L i n e s   =   s D a t a . s p l i t ( c v s S p l i t B y ) ;  
                 i n t   i C o u n t   =   0 ;  
                 f o r ( i n t   i = 0 ;   i < a L i n e s . l e n g t h ;   i + + )  
                 {  
                 	 i f ( o T e s t e r . A d d J o i n T e s t D a t a ( a L i n e s [ i ] ,   i ) )  
                 	 {  
                 	 	 i C o u n t + + ;  
                 	 }  
                 }        
                 r e t u r n   i C o u n t ;  
         }  
          
        
      
 }  
