 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   * /  
 p a c k a g e   h e l a b a s a ;  
  
  
 p u b l i c   c l a s s   H B R e g u l a r F o r m   e x t e n d s   H B F o r m   {  
  
 	 p r i v a t e   H B T r a n s f o r m R u l e   o _ R u l e   =   n u l l ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   F O R M _ T Y P E _ R E G U L A R   =   2 ;  
 	 	  
 	 p u b l i c   H B R e g u l a r F o r m ( )   {  
 	 	 o _ R u l e   =   n u l l ; 	 	  
 	 	 o _ F o r m 	 =   n u l l ;  
 	 }  
 	  
 	 p u b l i c   H B R e g u l a r F o r m ( H B T r a n s f o r m R u l e   o R u l e ,   H B W o r d   o F o r m )   {  
 	 	 o _ R u l e   =   o R u l e ; 	 	  
 	 	 o _ F o r m 	 =   o F o r m ;  
 	 	 / / t h i s .  
 	 }  
 	  
 	 p u b l i c   i n t   G e t F o r m T y p e ( )  
 	 {  
 	 	 r e t u r n   F O R M _ T Y P E _ R E G U L A R ;  
 	 }  
 	  
 	 p u b l i c   s h o r t   G e t T y p e ( )  
 	 {  
 	 	 r e t u r n   ( s h o r t ) o _ R u l e . G e t T y p e ( ) ; 	 	  
 	 }  
 	  
 	 p u b l i c   s h o r t   G e t S u b T y p e ( )  
 	 {  
 	 	 r e t u r n   ( s h o r t ) o _ R u l e . G e t S u b T y p e ( ) ; 	 	  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e   G e t R u l e ( )  
 	 {  
 	 	 r e t u r n   o _ R u l e ;  
 	 }  
 	  
 	 p u b l i c   H B W o r d   G e t F o r m ( )  
 	 {  
 	 	 r e t u r n   o _ F o r m ;  
 	 }  
 	  
 	 p u b l i c   S t r i n g   G e t M o d i f i e r ( )  
 	 {  
 	 	 r e t u r n   " + "   +   o _ R u l e . G e t S u f f i x ( ) . G e t N a t u r a l F o r m ( ) ;  
 	 } 	  
  
 }  
