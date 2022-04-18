// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.inputs.JobS3Location;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobDatabaseTableOutputOptions extends com.pulumi.resources.InvokeArgs {

    public static final JobDatabaseTableOutputOptions Empty = new JobDatabaseTableOutputOptions();

    @Import(name="tableName", required=true)
      private final String tableName;

    public String tableName() {
        return this.tableName;
    }

    @Import(name="tempDirectory")
      private final @Nullable JobS3Location tempDirectory;

    public Optional<JobS3Location> tempDirectory() {
        return this.tempDirectory == null ? Optional.empty() : Optional.ofNullable(this.tempDirectory);
    }

    public JobDatabaseTableOutputOptions(
        String tableName,
        @Nullable JobS3Location tempDirectory) {
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
        this.tempDirectory = tempDirectory;
    }

    private JobDatabaseTableOutputOptions() {
        this.tableName = null;
        this.tempDirectory = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDatabaseTableOutputOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tableName;
        private @Nullable JobS3Location tempDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDatabaseTableOutputOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableName = defaults.tableName;
    	      this.tempDirectory = defaults.tempDirectory;
        }

        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder tempDirectory(@Nullable JobS3Location tempDirectory) {
            this.tempDirectory = tempDirectory;
            return this;
        }        public JobDatabaseTableOutputOptions build() {
            return new JobDatabaseTableOutputOptions(tableName, tempDirectory);
        }
    }
}
