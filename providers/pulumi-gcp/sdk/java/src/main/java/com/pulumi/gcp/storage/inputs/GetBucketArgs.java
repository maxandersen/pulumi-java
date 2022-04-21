// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBucketArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBucketArgs Empty = new GetBucketArgs();

    /**
     * The name of the bucket.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private GetBucketArgs() {}

    private GetBucketArgs(GetBucketArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBucketArgs $;

        public Builder() {
            $ = new GetBucketArgs();
        }

        public Builder(GetBucketArgs defaults) {
            $ = new GetBucketArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetBucketArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
