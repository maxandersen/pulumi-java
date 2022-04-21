// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs Empty = new VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs();

    /**
     * The criteria for determining a SAN&#39;s match.
     * 
     */
    @Import(name="match", required=true)
    private Output<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs> match;

    public Output<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs> match() {
        return this.match;
    }

    private VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs() {}

    private VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs $) {
        this.match = $.match;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs $;

        public Builder() {
            $ = new VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs();
        }

        public Builder(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs defaults) {
            $ = new VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder match(Output<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs> match) {
            $.match = match;
            return this;
        }

        public Builder match(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs match) {
            return match(Output.of(match));
        }

        public VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs build() {
            $.match = Objects.requireNonNull($.match, "expected parameter 'match' to be non-null");
            return $;
        }
    }

}
