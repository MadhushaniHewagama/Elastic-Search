 p a c k a g e   h e l a b a s a ;  
  
 p u b l i c   c l a s s   H B U s e r   {  
  
 	 p r i v a t e   S t r i n g   s _ U s e r n a m e   =   " " ;  
 	 p r i v a t e   S t r i n g   s _ P w d H a s h   =   " " ;  
 	 p r i v a t e   s h o r t   i _ U s e r I D   =   0 ;  
 	 p r i v a t e   s h o r t   i _ U s e r R o l e   =   0 ;  
 	  
 	  
 	 p u b l i c   H B U s e r ( S t r i n g   s U s e r n a m e ,   S t r i n g   s P w d H a s h ,   s h o r t   i U s e r I D ,   s h o r t   i U s e r R o l e )    
 	 {  
 	 	 s _ U s e r n a m e   =   s U s e r n a m e ;  
 	 	 s _ P w d H a s h   =   s P w d H a s h ;  
 	 	 i _ U s e r I D   =   i U s e r I D ;  
 	 	 i _ U s e r R o l e   =   i U s e r R o l e ;  
 	 }  
  
  
 	 p u b l i c   S t r i n g   G e t U s e r N a m e ( )  
 	 {  
 	 	 r e t u r n   s _ U s e r n a m e ;  
 	 }  
 	  
 	 p u b l i c   s h o r t   G e t U s e r I D ( )  
 	 {  
 	 	 r e t u r n   i _ U s e r I D ; 	 	  
 	 }  
 	  
 	 p u b l i c   S t r i n g   G e t U s e r P a s s w o r d H a s h ( )  
 	 {  
 	 	 r e t u r n   s _ P w d H a s h ;  
 	 }  
 	  
 	 p u b l i c   s h o r t   G e t U s e r R o l e ( )  
 	 {  
 	 	 r e t u r n   i _ U s e r R o l e ;  
 	 }  
 	  
 	 p u b l i c   v o i d   D e b u g P r i n t ( )  
 	 {  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " U s e r   :   U = "   +   s _ U s e r n a m e   +   "   :   P = "   +   s _ P w d H a s h   +   "   :   R = "   +   i _ U s e r R o l e   +   "   :   U I D = "   +   i _ U s e r I D ) ;  
 	 }  
 }  
