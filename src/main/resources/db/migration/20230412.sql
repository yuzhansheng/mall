CREATE TABLE IF NOT EXISTS app_scl_shopping_cart
(
    cart_id      BIGINT PRIMARY KEY,
    snack_id     INTEGER      NOT NULL,
    snack_name   VARCHAR(255) NOT NULL,
    snack_price  FLOAT        NOT NULL,
    snack_number INTEGER      NOT NULL
);

CREATE TABLE IF NOT EXISTS app_scl_deliver
(
    deliver_id VARCHAR(255) PRIMARY KEY,
    user_phone VARCHAR(255) NOT NULL,
    name       VARCHAR(255) NOT NULL,
    gender     VARCHAR(255) NOT NULL,
    phone      VARCHAR(255) NOT NULL,
    address    VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS app_scl_service_category
(
    service_category_id INTEGER PRIMARY KEY,
    service_category    VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS app_scl_services
(
    service_id       BIGINT PRIMARY KEY,
    service_name     VARCHAR(255) NOT NULL,
    service_category INTEGER      NOT NULL,
    service_content  TEXT         NOT NULL,
    service_fee      FLOAT        NOT NULL,
    service_status   INTEGER      NOT NULL,
    service_stime    TIMESTAMP    NOT NULL,
    service_etime    TIMESTAMP    NOT NULL
);

CREATE TABLE IF NOT EXISTS app_scl_service_order
(
    order_service_id       VARCHAR(255) PRIMARY KEY,
    service_id             BIGINT  NOT NULL,
    service_content        VARCHAR(255),
    order_service_fee      FLOAT   NOT NULL,
    order_platform_fee     VARCHAR(255),
    order_service_score    VARCHAR(255),
    order_service_category INTEGER NOT NULL,
    order_service_status   VARCHAR(255),
    order_service_stime    TIMESTAMP,
    order_service_etime    TIMESTAMP
);

CREATE TABLE IF NOT EXISTS app_scl_snack_order
(
    order_snack_id VARCHAR(255) PRIMARY KEY,
    user_id        INTEGER      NOT NULL,
    snack_id       INTEGER      NOT NULL,
    name           VARCHAR(255) NOT NULL,
    phone          VARCHAR(255) NOT NULL,
    order_time     TIMESTAMP    NOT NULL,
    address        VARCHAR(255) NOT NULL,
    deliver_time   VARCHAR(255),
    total_cost     FLOAT        NOT NULL,
    note           VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS app_scl_user_info
(
    user_id  SERIAL PRIMARY KEY,
    phone    VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    name     VARCHAR(255) NOT NULL,
    gender   VARCHAR(255) NOT NULL,
    college  VARCHAR(255) NOT NULL,
    major    VARCHAR(255) NOT NULL,
    location VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS app_scl_snacks
(
    snack_id       SERIAL PRIMARY KEY,
    snack_name     VARCHAR(255) NOT NULL,
    snack_price    FLOAT        NOT NULL,
    snack_category INTEGER      NOT NULL,
    snack_info     VARCHAR(255) NOT NULL,
    snack_balance  INTEGER      NOT NULL,
    snack_pic      bytea,
    pic_string     VARCHAR(255)
);