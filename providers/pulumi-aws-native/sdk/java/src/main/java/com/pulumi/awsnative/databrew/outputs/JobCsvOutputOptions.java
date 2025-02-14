// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobCsvOutputOptions {
    private final @Nullable String delimiter;

    @CustomType.Constructor
    private JobCsvOutputOptions(@CustomType.Parameter("delimiter") @Nullable String delimiter) {
        this.delimiter = delimiter;
    }

    public Optional<String> delimiter() {
        return Optional.ofNullable(this.delimiter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCsvOutputOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String delimiter;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCsvOutputOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delimiter = defaults.delimiter;
        }

        public Builder delimiter(@Nullable String delimiter) {
            this.delimiter = delimiter;
            return this;
        }        public JobCsvOutputOptions build() {
            return new JobCsvOutputOptions(delimiter);
        }
    }
}
