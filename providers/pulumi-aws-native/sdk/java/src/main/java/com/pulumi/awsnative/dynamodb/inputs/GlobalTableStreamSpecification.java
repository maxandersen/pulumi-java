// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.dynamodb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GlobalTableStreamSpecification extends com.pulumi.resources.InvokeArgs {

    public static final GlobalTableStreamSpecification Empty = new GlobalTableStreamSpecification();

    @Import(name="streamViewType", required=true)
    private String streamViewType;

    public String streamViewType() {
        return this.streamViewType;
    }

    private GlobalTableStreamSpecification() {}

    private GlobalTableStreamSpecification(GlobalTableStreamSpecification $) {
        this.streamViewType = $.streamViewType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalTableStreamSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalTableStreamSpecification $;

        public Builder() {
            $ = new GlobalTableStreamSpecification();
        }

        public Builder(GlobalTableStreamSpecification defaults) {
            $ = new GlobalTableStreamSpecification(Objects.requireNonNull(defaults));
        }

        public Builder streamViewType(String streamViewType) {
            $.streamViewType = streamViewType;
            return this;
        }

        public GlobalTableStreamSpecification build() {
            $.streamViewType = Objects.requireNonNull($.streamViewType, "expected parameter 'streamViewType' to be non-null");
            return $;
        }
    }

}
