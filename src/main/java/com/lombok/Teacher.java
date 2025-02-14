package com.lombok;

import lombok.With;

public record Teacher(@With String id, @With String name, @With String subject) {
}
