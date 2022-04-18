// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a time zone from the [IANA Time Zone Database](https://www.iana.org/time-zones).
 * 
 */
public final class TimeZoneArgs extends com.pulumi.resources.ResourceArgs {

    public static final TimeZoneArgs Empty = new TimeZoneArgs();

    /**
     * IANA Time Zone Database time zone, e.g. "America/New_York".
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Optional. IANA Time Zone Database version number, e.g. "2019a".
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public TimeZoneArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> version) {
        this.id = id;
        this.version = version;
    }

    private TimeZoneArgs() {
        this.id = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeZoneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.version = defaults.version;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public TimeZoneArgs build() {
            return new TimeZoneArgs(id, version);
        }
    }
}
