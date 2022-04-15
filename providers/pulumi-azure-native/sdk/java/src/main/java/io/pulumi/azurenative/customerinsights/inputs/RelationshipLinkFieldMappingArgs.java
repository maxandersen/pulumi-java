// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.azurenative.customerinsights.enums.LinkTypes;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The fields mapping for Relationships.
 * 
 */
public final class RelationshipLinkFieldMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final RelationshipLinkFieldMappingArgs Empty = new RelationshipLinkFieldMappingArgs();

    /**
     * The field name on the Interaction Type.
     * 
     */
    @Import(name="interactionFieldName", required=true)
      private final Output<String> interactionFieldName;

    public Output<String> interactionFieldName() {
        return this.interactionFieldName;
    }

    /**
     * Link type.
     * 
     */
    @Import(name="linkType")
      private final @Nullable Output<LinkTypes> linkType;

    public Output<LinkTypes> linkType() {
        return this.linkType == null ? Codegen.empty() : this.linkType;
    }

    /**
     * The field name on the Relationship metadata.
     * 
     */
    @Import(name="relationshipFieldName", required=true)
      private final Output<String> relationshipFieldName;

    public Output<String> relationshipFieldName() {
        return this.relationshipFieldName;
    }

    public RelationshipLinkFieldMappingArgs(
        Output<String> interactionFieldName,
        @Nullable Output<LinkTypes> linkType,
        Output<String> relationshipFieldName) {
        this.interactionFieldName = Objects.requireNonNull(interactionFieldName, "expected parameter 'interactionFieldName' to be non-null");
        this.linkType = linkType;
        this.relationshipFieldName = Objects.requireNonNull(relationshipFieldName, "expected parameter 'relationshipFieldName' to be non-null");
    }

    private RelationshipLinkFieldMappingArgs() {
        this.interactionFieldName = Codegen.empty();
        this.linkType = Codegen.empty();
        this.relationshipFieldName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipLinkFieldMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> interactionFieldName;
        private @Nullable Output<LinkTypes> linkType;
        private Output<String> relationshipFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipLinkFieldMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interactionFieldName = defaults.interactionFieldName;
    	      this.linkType = defaults.linkType;
    	      this.relationshipFieldName = defaults.relationshipFieldName;
        }

        public Builder interactionFieldName(Output<String> interactionFieldName) {
            this.interactionFieldName = Objects.requireNonNull(interactionFieldName);
            return this;
        }
        public Builder interactionFieldName(String interactionFieldName) {
            this.interactionFieldName = Output.of(Objects.requireNonNull(interactionFieldName));
            return this;
        }
        public Builder linkType(@Nullable Output<LinkTypes> linkType) {
            this.linkType = linkType;
            return this;
        }
        public Builder linkType(@Nullable LinkTypes linkType) {
            this.linkType = Codegen.ofNullable(linkType);
            return this;
        }
        public Builder relationshipFieldName(Output<String> relationshipFieldName) {
            this.relationshipFieldName = Objects.requireNonNull(relationshipFieldName);
            return this;
        }
        public Builder relationshipFieldName(String relationshipFieldName) {
            this.relationshipFieldName = Output.of(Objects.requireNonNull(relationshipFieldName));
            return this;
        }        public RelationshipLinkFieldMappingArgs build() {
            return new RelationshipLinkFieldMappingArgs(interactionFieldName, linkType, relationshipFieldName);
        }
    }
}
