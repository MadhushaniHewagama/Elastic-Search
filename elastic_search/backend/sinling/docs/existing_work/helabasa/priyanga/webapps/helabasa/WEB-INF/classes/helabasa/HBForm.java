 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   * /  
 p a c k a g e   h e l a b a s a ;  
  
 p u b l i c   c l a s s   H B F o r m   {  
 	  
 	 p r o t e c t e d   H B W o r d 	 o _ F o r m 	 =   n u l l ;  
  
 	 p u b l i c   H B F o r m ( )   {  
 	 	 o _ F o r m 	 =   n u l l ; 	  
 	 }  
 	  
 	 p u b l i c   S t r i n g   G e t N a t u r a l F o r m ( )  
 	 {  
 	 	 r e t u r n   o _ F o r m . G e t N a t u r a l F o r m ( ) ;  
 	 }  
  
 	 p u b l i c   S t r i n g   G e t M o d i f i e r ( )  
 	 {  
 	 	 r e t u r n   " " ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t F o r m T y p e ( )  
 	 {  
 	 	 r e t u r n   0 ;  
 	 }  
 	  
 	 p u b l i c   s h o r t   G e t T y p e ( )  
 	 {  
 	 	 r e t u r n   0 ; 	 	  
 	 }  
 	  
 	 p u b l i c   s h o r t   G e t S u b T y p e ( )  
 	 {  
 	 	 r e t u r n   0 ; 	 	  
 	 }  
 	  
 	 p u b l i c   H B W o r d   G e t W o r d ( )  
 	 {  
 	 	 r e t u r n   o _ F o r m ;  
 	 } 	  
 	  
 	 p u b l i c   v o i d   D e b u g P r i n t ( )  
 	 {  
 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " L e m m a   "   +   G e t M o d i f i e r ( )   +   "   =   "   +   G e t N a t u r a l F o r m ( )   +   "   :   [ "   +   o _ F o r m . G e t F r e q u e n c y ( )   +   " ] " ) ; 	 	  
 	 }  
 	  
 	 p u b l i c   v o i d   S e t L e m m a ( H B L e m m a   o L e m m a )  
 	 { 	 	  
 	 }  
 	  
 	 p u b l i c   H B L e m m a   G e t L e m m a ( )  
 	 {  
 	 	 r e t u r n   n u l l ;  
 	 } 	  
 }  
