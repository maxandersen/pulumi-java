// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquerydatatransfer_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents preferences for sending email notifications for transfer run events.
 * 
 */
public final class EmailPreferencesArgs extends com.pulumi.resources.ResourceArgs {

    public static final EmailPreferencesArgs Empty = new EmailPreferencesArgs();

    /**
     * If true, email notifications will be sent on transfer run failures.
     * 
     */
    @Import(name="enableFailureEmail")
    private @Nullable Output<Boolean> enableFailureEmail;

    public Optional<Output<Boolean>> enableFailureEmail() {
        return Optional.ofNullable(this.enableFailureEmail);
    }

    private EmailPreferencesArgs() {}

    private EmailPreferencesArgs(EmailPreferencesArgs $) {
        this.enableFailureEmail = $.enableFailureEmail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailPreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailPreferencesArgs $;

        public Builder() {
            $ = new EmailPreferencesArgs();
        }

        public Builder(EmailPreferencesArgs defaults) {
            $ = new EmailPreferencesArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableFailureEmail(@Nullable Output<Boolean> enableFailureEmail) {
            $.enableFailureEmail = enableFailureEmail;
            return this;
        }

        public Builder enableFailureEmail(Boolean enableFailureEmail) {
            return enableFailureEmail(Output.of(enableFailureEmail));
        }

        public EmailPreferencesArgs build() {
            return $;
        }
    }

}
