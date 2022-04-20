// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingsResponse {
    /**
     * Workload compression flag. This has been added so that &#39;isSqlCompression&#39;
     * will be deprecated once clients upgrade to consider this flag.
     * 
     */
    private final @Nullable Boolean isCompression;
    /**
     * SQL compression flag
     * 
     */
    private final @Nullable Boolean issqlcompression;
    /**
     * TimeZone optional input as string. For example: TimeZone = &#34;Pacific Standard Time&#34;.
     * 
     */
    private final @Nullable String timeZone;

    @CustomType.Constructor
    private SettingsResponse(
        @CustomType.Parameter("isCompression") @Nullable Boolean isCompression,
        @CustomType.Parameter("issqlcompression") @Nullable Boolean issqlcompression,
        @CustomType.Parameter("timeZone") @Nullable String timeZone) {
        this.isCompression = isCompression;
        this.issqlcompression = issqlcompression;
        this.timeZone = timeZone;
    }

    /**
     * Workload compression flag. This has been added so that &#39;isSqlCompression&#39;
     * will be deprecated once clients upgrade to consider this flag.
     * 
    */
    public Optional<Boolean> isCompression() {
        return Optional.ofNullable(this.isCompression);
    }
    /**
     * SQL compression flag
     * 
    */
    public Optional<Boolean> issqlcompression() {
        return Optional.ofNullable(this.issqlcompression);
    }
    /**
     * TimeZone optional input as string. For example: TimeZone = &#34;Pacific Standard Time&#34;.
     * 
    */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isCompression;
        private @Nullable Boolean issqlcompression;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(SettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCompression = defaults.isCompression;
    	      this.issqlcompression = defaults.issqlcompression;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder isCompression(@Nullable Boolean isCompression) {
            this.isCompression = isCompression;
            return this;
        }
        public Builder issqlcompression(@Nullable Boolean issqlcompression) {
            this.issqlcompression = issqlcompression;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }        public SettingsResponse build() {
            return new SettingsResponse(isCompression, issqlcompression, timeZone);
        }
    }
}
