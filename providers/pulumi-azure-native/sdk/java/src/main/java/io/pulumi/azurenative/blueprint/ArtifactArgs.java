// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.blueprint.enums.ArtifactKind;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ArtifactArgs extends io.pulumi.resources.ResourceArgs {

    public static final ArtifactArgs Empty = new ArtifactArgs();

    /**
     * Name of the blueprint artifact.
     * 
     */
    @Import(name="artifactName")
      private final @Nullable Output<String> artifactName;

    public Output<String> artifactName() {
        return this.artifactName == null ? Codegen.empty() : this.artifactName;
    }

    /**
     * Name of the blueprint definition.
     * 
     */
    @Import(name="blueprintName", required=true)
      private final Output<String> blueprintName;

    public Output<String> blueprintName() {
        return this.blueprintName;
    }

    /**
     * Specifies the kind of blueprint artifact.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Either<String,ArtifactKind>> kind;

    public Output<Either<String,ArtifactKind>> kind() {
        return this.kind;
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}').
     * 
     */
    @Import(name="resourceScope", required=true)
      private final Output<String> resourceScope;

    public Output<String> resourceScope() {
        return this.resourceScope;
    }

    public ArtifactArgs(
        @Nullable Output<String> artifactName,
        Output<String> blueprintName,
        Output<Either<String,ArtifactKind>> kind,
        Output<String> resourceScope) {
        this.artifactName = artifactName;
        this.blueprintName = Objects.requireNonNull(blueprintName, "expected parameter 'blueprintName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceScope = Objects.requireNonNull(resourceScope, "expected parameter 'resourceScope' to be non-null");
    }

    private ArtifactArgs() {
        this.artifactName = Codegen.empty();
        this.blueprintName = Codegen.empty();
        this.kind = Codegen.empty();
        this.resourceScope = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> artifactName;
        private Output<String> blueprintName;
        private Output<Either<String,ArtifactKind>> kind;
        private Output<String> resourceScope;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactName = defaults.artifactName;
    	      this.blueprintName = defaults.blueprintName;
    	      this.kind = defaults.kind;
    	      this.resourceScope = defaults.resourceScope;
        }

        public Builder artifactName(@Nullable Output<String> artifactName) {
            this.artifactName = artifactName;
            return this;
        }
        public Builder artifactName(@Nullable String artifactName) {
            this.artifactName = Codegen.ofNullable(artifactName);
            return this;
        }
        public Builder blueprintName(Output<String> blueprintName) {
            this.blueprintName = Objects.requireNonNull(blueprintName);
            return this;
        }
        public Builder blueprintName(String blueprintName) {
            this.blueprintName = Output.of(Objects.requireNonNull(blueprintName));
            return this;
        }
        public Builder kind(Output<Either<String,ArtifactKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(Either<String,ArtifactKind> kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder resourceScope(Output<String> resourceScope) {
            this.resourceScope = Objects.requireNonNull(resourceScope);
            return this;
        }
        public Builder resourceScope(String resourceScope) {
            this.resourceScope = Output.of(Objects.requireNonNull(resourceScope));
            return this;
        }        public ArtifactArgs build() {
            return new ArtifactArgs(artifactName, blueprintName, kind, resourceScope);
        }
    }
}
