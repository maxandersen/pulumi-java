// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wisdom.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AssistantAssociationAssociationDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssistantAssociationAssociationDataArgs Empty = new AssistantAssociationAssociationDataArgs();

    @Import(name="knowledgeBaseId", required=true)
    private Output<String> knowledgeBaseId;

    public Output<String> knowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    private AssistantAssociationAssociationDataArgs() {}

    private AssistantAssociationAssociationDataArgs(AssistantAssociationAssociationDataArgs $) {
        this.knowledgeBaseId = $.knowledgeBaseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssistantAssociationAssociationDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssistantAssociationAssociationDataArgs $;

        public Builder() {
            $ = new AssistantAssociationAssociationDataArgs();
        }

        public Builder(AssistantAssociationAssociationDataArgs defaults) {
            $ = new AssistantAssociationAssociationDataArgs(Objects.requireNonNull(defaults));
        }

        public Builder knowledgeBaseId(Output<String> knowledgeBaseId) {
            $.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        public Builder knowledgeBaseId(String knowledgeBaseId) {
            return knowledgeBaseId(Output.of(knowledgeBaseId));
        }

        public AssistantAssociationAssociationDataArgs build() {
            $.knowledgeBaseId = Objects.requireNonNull($.knowledgeBaseId, "expected parameter 'knowledgeBaseId' to be non-null");
            return $;
        }
    }

}
