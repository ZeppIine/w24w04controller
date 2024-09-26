package kr.ac.kumoh.ce.s20180147.w24w04controller.controller

import kr.ac.kumoh.ce.s20180147.w24w04controller.model.Song
import kr.ac.kumoh.ce.s20180147.w24w04controller.service.SongService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController(val service: SongService) {
  @GetMapping("/song/list")
  fun getSongList(): List<Song> {
    return service.getAllSongs()
  }
}