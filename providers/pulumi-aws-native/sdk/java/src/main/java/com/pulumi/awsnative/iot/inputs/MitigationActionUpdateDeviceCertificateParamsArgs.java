// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.awsnative.iot.enums.MitigationActionUpdateDeviceCertificateParamsAction;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Parameters to define a mitigation action that changes the state of the device certificate to inactive.
 * 
 */
public final class MitigationActionUpdateDeviceCertificateParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MitigationActionUpdateDeviceCertificateParamsArgs Empty = new MitigationActionUpdateDeviceCertificateParamsArgs();

    @Import(name="action", required=true)
    private Output<MitigationActionUpdateDeviceCertificateParamsAction> action;

    public Output<MitigationActionUpdateDeviceCertificateParamsAction> action() {
        return this.action;
    }

    private MitigationActionUpdateDeviceCertificateParamsArgs() {}

    private MitigationActionUpdateDeviceCertificateParamsArgs(MitigationActionUpdateDeviceCertificateParamsArgs $) {
        this.action = $.action;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MitigationActionUpdateDeviceCertificateParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MitigationActionUpdateDeviceCertificateParamsArgs $;

        public Builder() {
            $ = new MitigationActionUpdateDeviceCertificateParamsArgs();
        }

        public Builder(MitigationActionUpdateDeviceCertificateParamsArgs defaults) {
            $ = new MitigationActionUpdateDeviceCertificateParamsArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(Output<MitigationActionUpdateDeviceCertificateParamsAction> action) {
            $.action = action;
            return this;
        }

        public Builder action(MitigationActionUpdateDeviceCertificateParamsAction action) {
            return action(Output.of(action));
        }

        public MitigationActionUpdateDeviceCertificateParamsArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            return $;
        }
    }

}
