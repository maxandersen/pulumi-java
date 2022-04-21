// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Copy on Expiry Option
 * 
 */
public final class CopyOnExpiryOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CopyOnExpiryOptionArgs Empty = new CopyOnExpiryOptionArgs();

    /**
     * Type of the specific object - used for deserializing
     * Expected value is &#39;CopyOnExpiryOption&#39;.
     * 
     */
    @Import(name="objectType", required=true)
    private Output<String> objectType;

    public Output<String> objectType() {
        return this.objectType;
    }

    private CopyOnExpiryOptionArgs() {}

    private CopyOnExpiryOptionArgs(CopyOnExpiryOptionArgs $) {
        this.objectType = $.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CopyOnExpiryOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CopyOnExpiryOptionArgs $;

        public Builder() {
            $ = new CopyOnExpiryOptionArgs();
        }

        public Builder(CopyOnExpiryOptionArgs defaults) {
            $ = new CopyOnExpiryOptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder objectType(Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        public CopyOnExpiryOptionArgs build() {
            $.objectType = Codegen.stringProp("objectType").output().arg($.objectType).require();
            return $;
        }
    }

}
