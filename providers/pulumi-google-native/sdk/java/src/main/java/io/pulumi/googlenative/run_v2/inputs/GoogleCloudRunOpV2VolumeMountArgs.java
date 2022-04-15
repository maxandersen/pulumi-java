// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * VolumeMount describes a mounting of a Volume within a container.
 * 
 */
public final class GoogleCloudRunOpV2VolumeMountArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunOpV2VolumeMountArgs Empty = new GoogleCloudRunOpV2VolumeMountArgs();

    /**
     * Path within the container at which the volume should be mounted. Must not contain ':'. For Cloud SQL volumes, it can be left empty, or must otherwise be `/cloudsql`. All instances defined in the Volume will be available as `/cloudsql/[instance]`. For more information on Cloud SQL volumes, visit https://cloud.google.com/sql/docs/mysql/connect-run
     * 
     */
    @Import(name="mountPath", required=true)
      private final Output<String> mountPath;

    public Output<String> mountPath() {
        return this.mountPath;
    }

    /**
     * This must match the Name of a Volume.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    public GoogleCloudRunOpV2VolumeMountArgs(
        Output<String> mountPath,
        Output<String> name) {
        this.mountPath = Objects.requireNonNull(mountPath, "expected parameter 'mountPath' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GoogleCloudRunOpV2VolumeMountArgs() {
        this.mountPath = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2VolumeMountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> mountPath;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2VolumeMountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
        }

        public Builder mountPath(Output<String> mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }
        public Builder mountPath(String mountPath) {
            this.mountPath = Output.of(Objects.requireNonNull(mountPath));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public GoogleCloudRunOpV2VolumeMountArgs build() {
            return new GoogleCloudRunOpV2VolumeMountArgs(mountPath, name);
        }
    }
}
