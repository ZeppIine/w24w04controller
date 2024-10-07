package kr.ac.kumoh.ce.s20180147.w24w04controller.service

import kr.ac.kumoh.ce.s20180147.w24w04controller.model.Song
import kr.ac.kumoh.ce.s20180147.w24w04controller.repository.SongRepository
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class SongService(val repository: SongRepository) {
  fun getAllSongs(): List<Song> {
    return repository.fetchSong()
  }

  fun getRandomSong(): Song {
    return repository.getSong(Random.nextInt(3))
  }
}