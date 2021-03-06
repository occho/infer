(*
* Copyright (c) 2009 -2013 Monoidics ltd.
* Copyright (c) 2013 - Facebook.
* All rights reserved.
*)

open Javalib_pack


(** Translate an item annotation. *)
val translate_item : (JBasics.annotation * Javalib.visibility) list -> Sil.item_annotation

(** Translate a method annotation. *)
val translate_method : Javalib.method_annotations -> Sil.method_annotation
