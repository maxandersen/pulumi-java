// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters used in Dataproc JobType executions.
 * 
 */
public final class DataprocParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataprocParametersArgs Empty = new DataprocParametersArgs();

    /**
     * URI for cluster used to run Dataproc execution. Format: `projects/{PROJECT_ID}/regions/{REGION}/clusters/{CLUSTER_NAME}`
     * 
     */
    @Import(name="cluster")
      private final @Nullable Output<String> cluster;

    public Output<String> cluster() {
        return this.cluster == null ? Codegen.empty() : this.cluster;
    }

    public DataprocParametersArgs(@Nullable Output<String> cluster) {
        this.cluster = cluster;
    }

    private DataprocParametersArgs() {
        this.cluster = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataprocParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cluster;

        public Builder() {
    	      // Empty
        }

        public Builder(DataprocParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
        }

        public Builder cluster(@Nullable Output<String> cluster) {
            this.cluster = cluster;
            return this;
        }
        public Builder cluster(@Nullable String cluster) {
            this.cluster = Codegen.ofNullable(cluster);
            return this;
        }        public DataprocParametersArgs build() {
            return new DataprocParametersArgs(cluster);
        }
    }
}
