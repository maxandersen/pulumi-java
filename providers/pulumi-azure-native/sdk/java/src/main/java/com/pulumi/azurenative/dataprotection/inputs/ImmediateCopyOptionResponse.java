// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Immediate copy Option
 * 
 */
public final class ImmediateCopyOptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImmediateCopyOptionResponse Empty = new ImmediateCopyOptionResponse();

    /**
     * Type of the specific object - used for deserializing
     * Expected value is &#39;ImmediateCopyOption&#39;.
     * 
     */
    @Import(name="objectType", required=true)
    private String objectType;

    public String objectType() {
        return this.objectType;
    }

    private ImmediateCopyOptionResponse() {}

    private ImmediateCopyOptionResponse(ImmediateCopyOptionResponse $) {
        this.objectType = $.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImmediateCopyOptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImmediateCopyOptionResponse $;

        public Builder() {
            $ = new ImmediateCopyOptionResponse();
        }

        public Builder(ImmediateCopyOptionResponse defaults) {
            $ = new ImmediateCopyOptionResponse(Objects.requireNonNull(defaults));
        }

        public Builder objectType(String objectType) {
            $.objectType = objectType;
            return this;
        }

        public ImmediateCopyOptionResponse build() {
            $.objectType = Codegen.stringProp("objectType").arg($.objectType).require();
            return $;
        }
    }

}
