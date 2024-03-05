SELECT BOARD.TITLE, BOARD.BOARD_ID, REPLY.REPLY_ID, REPLY.WRITER_ID, REPLY.CONTENTS, DATE_FORMAT(REPLY.CREATED_DATE,'%Y-%m-%d' ) AS CREATED_DATE
FROM USED_GOODS_BOARD AS BOARD JOIN USED_GOODS_REPLY AS REPLY
    ON board.BOARD_ID = reply.BOARD_ID
WHERE BOARD.CREATED_DATE >= "2020-10-01"  and board.CREATED_DATE < '2022-11-01'
ORDER BY REPLY.CREATED_DATE ASC, BOARD.TITLE ASC