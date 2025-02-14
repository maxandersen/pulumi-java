// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SystemDataResponse {
    private final @Nullable String createdAt;
    private final @Nullable String createdBy;
    private final @Nullable String createdByType;
    private final @Nullable String lastModifiedAt;
    private final @Nullable String lastModifiedBy;
    private final @Nullable String lastModifiedByType;

    @CustomType.Constructor
    private SystemDataResponse(
        @CustomType.Parameter("createdAt") @Nullable String createdAt,
        @CustomType.Parameter("createdBy") @Nullable String createdBy,
        @CustomType.Parameter("createdByType") @Nullable String createdByType,
        @CustomType.Parameter("lastModifiedAt") @Nullable String lastModifiedAt,
        @CustomType.Parameter("lastModifiedBy") @Nullable String lastModifiedBy,
        @CustomType.Parameter("lastModifiedByType") @Nullable String lastModifiedByType) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByType = createdByType;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByType = lastModifiedByType;
    }

    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }
    public Optional<String> createdByType() {
        return Optional.ofNullable(this.createdByType);
    }
    public Optional<String> lastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }
    public Optional<String> lastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }
    public Optional<String> lastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createdAt;
        private @Nullable String createdBy;
        private @Nullable String createdByType;
        private @Nullable String lastModifiedAt;
        private @Nullable String lastModifiedBy;
        private @Nullable String lastModifiedByType;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
        }

        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder createdBy(@Nullable String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public Builder createdByType(@Nullable String createdByType) {
            this.createdByType = createdByType;
            return this;
        }
        public Builder lastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }
        public Builder lastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public Builder lastModifiedByType(@Nullable String lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }        public SystemDataResponse build() {
            return new SystemDataResponse(createdAt, createdBy, createdByType, lastModifiedAt, lastModifiedBy, lastModifiedByType);
        }
    }
}
