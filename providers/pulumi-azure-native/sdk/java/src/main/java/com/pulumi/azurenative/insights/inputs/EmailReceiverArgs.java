// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An email receiver.
 * 
 */
public final class EmailReceiverArgs extends ResourceArgs {

    public static final EmailReceiverArgs Empty = new EmailReceiverArgs();

    /**
     * The email address of this receiver.
     * 
     */
    @Import(name="emailAddress", required=true)
    private Output<String> emailAddress;

    /**
     * @return The email address of this receiver.
     * 
     */
    public Output<String> emailAddress() {
        return this.emailAddress;
    }

    /**
     * The name of the email receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the email receiver. Names must be unique across all receivers within an action group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Indicates whether to use common alert schema.
     * 
     */
    @Import(name="useCommonAlertSchema")
    private @Nullable Output<Boolean> useCommonAlertSchema;

    /**
     * @return Indicates whether to use common alert schema.
     * 
     */
    public Optional<Output<Boolean>> useCommonAlertSchema() {
        return Optional.ofNullable(this.useCommonAlertSchema);
    }

    private EmailReceiverArgs() {}

    private EmailReceiverArgs(EmailReceiverArgs $) {
        this.emailAddress = $.emailAddress;
        this.name = $.name;
        this.useCommonAlertSchema = $.useCommonAlertSchema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailReceiverArgs $;

        public Builder() {
            $ = new EmailReceiverArgs();
        }

        public Builder(EmailReceiverArgs defaults) {
            $ = new EmailReceiverArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param emailAddress The email address of this receiver.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(Output<String> emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        /**
         * @param emailAddress The email address of this receiver.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(String emailAddress) {
            return emailAddress(Output.of(emailAddress));
        }

        /**
         * @param name The name of the email receiver. Names must be unique across all receivers within an action group.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the email receiver. Names must be unique across all receivers within an action group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param useCommonAlertSchema Indicates whether to use common alert schema.
         * 
         * @return builder
         * 
         */
        public Builder useCommonAlertSchema(@Nullable Output<Boolean> useCommonAlertSchema) {
            $.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }

        /**
         * @param useCommonAlertSchema Indicates whether to use common alert schema.
         * 
         * @return builder
         * 
         */
        public Builder useCommonAlertSchema(Boolean useCommonAlertSchema) {
            return useCommonAlertSchema(Output.of(useCommonAlertSchema));
        }

        public EmailReceiverArgs build() {
            $.emailAddress = Objects.requireNonNull($.emailAddress, "expected parameter 'emailAddress' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.useCommonAlertSchema = Codegen.booleanProp("useCommonAlertSchema").output().arg($.useCommonAlertSchema).def(false).getNullable();
            return $;
        }
    }

}
