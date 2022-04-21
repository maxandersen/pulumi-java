// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class QuickConnectQuickConnectConfigPhoneConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final QuickConnectQuickConnectConfigPhoneConfigGetArgs Empty = new QuickConnectQuickConnectConfigPhoneConfigGetArgs();

    /**
     * Specifies the phone number in in E.164 format.
     * 
     */
    @Import(name="phoneNumber", required=true)
    private Output<String> phoneNumber;

    public Output<String> phoneNumber() {
        return this.phoneNumber;
    }

    private QuickConnectQuickConnectConfigPhoneConfigGetArgs() {}

    private QuickConnectQuickConnectConfigPhoneConfigGetArgs(QuickConnectQuickConnectConfigPhoneConfigGetArgs $) {
        this.phoneNumber = $.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QuickConnectQuickConnectConfigPhoneConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QuickConnectQuickConnectConfigPhoneConfigGetArgs $;

        public Builder() {
            $ = new QuickConnectQuickConnectConfigPhoneConfigGetArgs();
        }

        public Builder(QuickConnectQuickConnectConfigPhoneConfigGetArgs defaults) {
            $ = new QuickConnectQuickConnectConfigPhoneConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder phoneNumber(Output<String> phoneNumber) {
            $.phoneNumber = phoneNumber;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            return phoneNumber(Output.of(phoneNumber));
        }

        public QuickConnectQuickConnectConfigPhoneConfigGetArgs build() {
            $.phoneNumber = Objects.requireNonNull($.phoneNumber, "expected parameter 'phoneNumber' to be non-null");
            return $;
        }
    }

}
