// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * This submessage provides human-readable hints about the purpose of the authority. Because the name of a note acts as its resource reference, it is important to disambiguate the canonical name of the Note (which might be a UUID for security purposes) from &#34;readable&#34; names more suitable for debug output. Note that these hints should not be used to look up authorities in security sensitive contexts, such as when looking up attestations to verify.
 * 
 */
public final class HintResponse extends com.pulumi.resources.InvokeArgs {

    public static final HintResponse Empty = new HintResponse();

    /**
     * The human readable name of this attestation authority, for example &#34;qa&#34;.
     * 
     */
    @Import(name="humanReadableName", required=true)
    private String humanReadableName;

    public String humanReadableName() {
        return this.humanReadableName;
    }

    private HintResponse() {}

    private HintResponse(HintResponse $) {
        this.humanReadableName = $.humanReadableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HintResponse $;

        public Builder() {
            $ = new HintResponse();
        }

        public Builder(HintResponse defaults) {
            $ = new HintResponse(Objects.requireNonNull(defaults));
        }

        public Builder humanReadableName(String humanReadableName) {
            $.humanReadableName = humanReadableName;
            return this;
        }

        public HintResponse build() {
            $.humanReadableName = Objects.requireNonNull($.humanReadableName, "expected parameter 'humanReadableName' to be non-null");
            return $;
        }
    }

}
