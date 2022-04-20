// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * This submessage provides human-readable hints about the purpose of the authority. Because the name of a note acts as its resource reference, it is important to disambiguate the canonical name of the Note (which might be a UUID for security purposes) from &#34;readable&#34; names more suitable for debug output. Note that these hints should not be used to look up authorities in security sensitive contexts, such as when looking up attestations to verify.
 * 
 */
public final class HintArgs extends com.pulumi.resources.ResourceArgs {

    public static final HintArgs Empty = new HintArgs();

    /**
     * The human readable name of this attestation authority, for example &#34;qa&#34;.
     * 
     */
    @Import(name="humanReadableName", required=true)
      private final Output<String> humanReadableName;

    public Output<String> humanReadableName() {
        return this.humanReadableName;
    }

    public HintArgs(Output<String> humanReadableName) {
        this.humanReadableName = Objects.requireNonNull(humanReadableName, "expected parameter 'humanReadableName' to be non-null");
    }

    private HintArgs() {
        this.humanReadableName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> humanReadableName;

        public Builder() {
    	      // Empty
        }

        public Builder(HintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.humanReadableName = defaults.humanReadableName;
        }

        public Builder humanReadableName(Output<String> humanReadableName) {
            this.humanReadableName = Objects.requireNonNull(humanReadableName);
            return this;
        }
        public Builder humanReadableName(String humanReadableName) {
            this.humanReadableName = Output.of(Objects.requireNonNull(humanReadableName));
            return this;
        }        public HintArgs build() {
            return new HintArgs(humanReadableName);
        }
    }
}
