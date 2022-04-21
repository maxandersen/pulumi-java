// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wisdom.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetKnowledgeBaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKnowledgeBaseArgs Empty = new GetKnowledgeBaseArgs();

    @Import(name="knowledgeBaseId", required=true)
    private String knowledgeBaseId;

    public String knowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    private GetKnowledgeBaseArgs() {}

    private GetKnowledgeBaseArgs(GetKnowledgeBaseArgs $) {
        this.knowledgeBaseId = $.knowledgeBaseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKnowledgeBaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKnowledgeBaseArgs $;

        public Builder() {
            $ = new GetKnowledgeBaseArgs();
        }

        public Builder(GetKnowledgeBaseArgs defaults) {
            $ = new GetKnowledgeBaseArgs(Objects.requireNonNull(defaults));
        }

        public Builder knowledgeBaseId(String knowledgeBaseId) {
            $.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        public GetKnowledgeBaseArgs build() {
            $.knowledgeBaseId = Objects.requireNonNull($.knowledgeBaseId, "expected parameter 'knowledgeBaseId' to be non-null");
            return $;
        }
    }

}
