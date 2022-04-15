// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PersistenceResponse {
    /**
     * Sets whether AOF is enabled.
     * 
     */
    private final @Nullable Boolean aofEnabled;
    /**
     * Sets the frequency at which data is written to disk.
     * 
     */
    private final @Nullable String aofFrequency;
    /**
     * Sets whether RDB is enabled.
     * 
     */
    private final @Nullable Boolean rdbEnabled;
    /**
     * Sets the frequency at which a snapshot of the database is created.
     * 
     */
    private final @Nullable String rdbFrequency;

    @CustomType.Constructor
    private PersistenceResponse(
        @CustomType.Parameter("aofEnabled") @Nullable Boolean aofEnabled,
        @CustomType.Parameter("aofFrequency") @Nullable String aofFrequency,
        @CustomType.Parameter("rdbEnabled") @Nullable Boolean rdbEnabled,
        @CustomType.Parameter("rdbFrequency") @Nullable String rdbFrequency) {
        this.aofEnabled = aofEnabled;
        this.aofFrequency = aofFrequency;
        this.rdbEnabled = rdbEnabled;
        this.rdbFrequency = rdbFrequency;
    }

    /**
     * Sets whether AOF is enabled.
     * 
    */
    public Optional<Boolean> aofEnabled() {
        return Optional.ofNullable(this.aofEnabled);
    }
    /**
     * Sets the frequency at which data is written to disk.
     * 
    */
    public Optional<String> aofFrequency() {
        return Optional.ofNullable(this.aofFrequency);
    }
    /**
     * Sets whether RDB is enabled.
     * 
    */
    public Optional<Boolean> rdbEnabled() {
        return Optional.ofNullable(this.rdbEnabled);
    }
    /**
     * Sets the frequency at which a snapshot of the database is created.
     * 
    */
    public Optional<String> rdbFrequency() {
        return Optional.ofNullable(this.rdbFrequency);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean aofEnabled;
        private @Nullable String aofFrequency;
        private @Nullable Boolean rdbEnabled;
        private @Nullable String rdbFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aofEnabled = defaults.aofEnabled;
    	      this.aofFrequency = defaults.aofFrequency;
    	      this.rdbEnabled = defaults.rdbEnabled;
    	      this.rdbFrequency = defaults.rdbFrequency;
        }

        public Builder aofEnabled(@Nullable Boolean aofEnabled) {
            this.aofEnabled = aofEnabled;
            return this;
        }
        public Builder aofFrequency(@Nullable String aofFrequency) {
            this.aofFrequency = aofFrequency;
            return this;
        }
        public Builder rdbEnabled(@Nullable Boolean rdbEnabled) {
            this.rdbEnabled = rdbEnabled;
            return this;
        }
        public Builder rdbFrequency(@Nullable String rdbFrequency) {
            this.rdbFrequency = rdbFrequency;
            return this;
        }        public PersistenceResponse build() {
            return new PersistenceResponse(aofEnabled, aofFrequency, rdbEnabled, rdbFrequency);
        }
    }
}
