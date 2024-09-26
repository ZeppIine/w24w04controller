package kr.ac.kumoh.ce.s20180147.w24w04controller.repository

import kr.ac.kumoh.ce.s20180147.w24w04controller.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
  val songs = listOf(
    Song(1, "夏が僕らを呼ぶのなら ( If Summer is calling us) feat.わかばやし", "*Luna"),
    Song(2, "Rise up feat.初音ミク", "*Luna"),
    Song(3, "あの夏のいつかは (Someday in that Summer) feat.ねんね | 2023 Ver.", "*Luna"),
  )

  fun fetchSong() = songs
}