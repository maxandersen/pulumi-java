// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An artifact that can be deployed in some runtime.
 * 
 */
public final class DeploymentNoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentNoteArgs Empty = new DeploymentNoteArgs();

    /**
     * Resource URI for the artifact being deployed.
     * 
     */
    @Import(name="resourceUri", required=true)
      private final Output<List<String>> resourceUri;

    public Output<List<String>> resourceUri() {
        return this.resourceUri;
    }

    public DeploymentNoteArgs(Output<List<String>> resourceUri) {
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private DeploymentNoteArgs() {
        this.resourceUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentNoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder resourceUri(Output<List<String>> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public Builder resourceUri(List<String> resourceUri) {
            this.resourceUri = Output.of(Objects.requireNonNull(resourceUri));
            return this;
        }
        public Builder resourceUri(String... resourceUri) {
            return resourceUri(List.of(resourceUri));
        }        public DeploymentNoteArgs build() {
            return new DeploymentNoteArgs(resourceUri);
        }
    }
}
