// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ServiceTemplateSpecContainerVolumeMountGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerVolumeMountGetArgs Empty = new ServiceTemplateSpecContainerVolumeMountGetArgs();

    /**
     * Path within the container at which the volume should be mounted.  Must
     * not contain &#39;:&#39;.
     * 
     */
    @Import(name="mountPath", required=true)
      private final Output<String> mountPath;

    public Output<String> mountPath() {
        return this.mountPath;
    }

    /**
     * Volume&#39;s name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    public ServiceTemplateSpecContainerVolumeMountGetArgs(
        Output<String> mountPath,
        Output<String> name) {
        this.mountPath = Objects.requireNonNull(mountPath, "expected parameter 'mountPath' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ServiceTemplateSpecContainerVolumeMountGetArgs() {
        this.mountPath = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerVolumeMountGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> mountPath;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerVolumeMountGetArgs defaults) {
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
        }        public ServiceTemplateSpecContainerVolumeMountGetArgs build() {
            return new ServiceTemplateSpecContainerVolumeMountGetArgs(mountPath, name);
        }
    }
}
