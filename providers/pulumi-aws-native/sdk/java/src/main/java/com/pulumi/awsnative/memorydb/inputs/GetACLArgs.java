// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.memorydb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetACLArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetACLArgs Empty = new GetACLArgs();

    /**
     * The name of the acl.
     * 
     */
    @Import(name="aCLName", required=true)
    private String aCLName;

    /**
     * @return The name of the acl.
     * 
     */
    public String aCLName() {
        return this.aCLName;
    }

    private GetACLArgs() {}

    private GetACLArgs(GetACLArgs $) {
        this.aCLName = $.aCLName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetACLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetACLArgs $;

        public Builder() {
            $ = new GetACLArgs();
        }

        public Builder(GetACLArgs defaults) {
            $ = new GetACLArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aCLName The name of the acl.
         * 
         * @return builder
         * 
         */
        public Builder aCLName(String aCLName) {
            $.aCLName = aCLName;
            return this;
        }

        public GetACLArgs build() {
            $.aCLName = Objects.requireNonNull($.aCLName, "expected parameter 'aCLName' to be non-null");
            return $;
        }
    }

}
