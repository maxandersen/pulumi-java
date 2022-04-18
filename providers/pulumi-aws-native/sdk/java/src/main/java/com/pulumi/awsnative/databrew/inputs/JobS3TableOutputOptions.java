// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.inputs.JobS3Location;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class JobS3TableOutputOptions extends com.pulumi.resources.InvokeArgs {

    public static final JobS3TableOutputOptions Empty = new JobS3TableOutputOptions();

    @Import(name="location", required=true)
      private final JobS3Location location;

    public JobS3Location location() {
        return this.location;
    }

    public JobS3TableOutputOptions(JobS3Location location) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
    }

    private JobS3TableOutputOptions() {
        this.location = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobS3TableOutputOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobS3Location location;

        public Builder() {
    	      // Empty
        }

        public Builder(JobS3TableOutputOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
        }

        public Builder location(JobS3Location location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }        public JobS3TableOutputOptions build() {
            return new JobS3TableOutputOptions(location);
        }
    }
}
