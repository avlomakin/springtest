-- Table: public.message

-- DROP TABLE public.message;

CREATE TABLE public.message
(
  id integer NOT NULL DEFAULT nextval('test_table_id_seq'::regclass),
  message character varying(20),
  CONSTRAINT test_table_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.message
  OWNER TO postgres;

  
 
INSERT INTO public.message(
            id, message)
    VALUES (1, "Db data");
