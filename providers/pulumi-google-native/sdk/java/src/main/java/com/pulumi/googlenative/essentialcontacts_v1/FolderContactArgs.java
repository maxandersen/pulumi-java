// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.essentialcontacts_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.essentialcontacts_v1.enums.FolderContactNotificationCategorySubscriptionsItem;
import com.pulumi.googlenative.essentialcontacts_v1.enums.FolderContactValidationState;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FolderContactArgs extends com.pulumi.resources.ResourceArgs {

    public static final FolderContactArgs Empty = new FolderContactArgs();

    /**
     * The email address to send notifications to. This does not need to be a Google account.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The email address to send notifications to. This does not need to be a Google account.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    @Import(name="folderId", required=true)
    private Output<String> folderId;

    public Output<String> folderId() {
        return this.folderId;
    }

    /**
     * The preferred language for notifications, as a ISO 639-1 language code. See [Supported languages](https://cloud.google.com/resource-manager/docs/managing-notification-contacts#supported-languages) for a list of supported languages.
     * 
     */
    @Import(name="languageTag")
    private @Nullable Output<String> languageTag;

    /**
     * @return The preferred language for notifications, as a ISO 639-1 language code. See [Supported languages](https://cloud.google.com/resource-manager/docs/managing-notification-contacts#supported-languages) for a list of supported languages.
     * 
     */
    public Optional<Output<String>> languageTag() {
        return Optional.ofNullable(this.languageTag);
    }

    /**
     * The identifier for the contact. Format: {resource_type}/{resource_id}/contacts/{contact_id}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The identifier for the contact. Format: {resource_type}/{resource_id}/contacts/{contact_id}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The categories of notifications that the contact will receive communications for.
     * 
     */
    @Import(name="notificationCategorySubscriptions")
    private @Nullable Output<List<FolderContactNotificationCategorySubscriptionsItem>> notificationCategorySubscriptions;

    /**
     * @return The categories of notifications that the contact will receive communications for.
     * 
     */
    public Optional<Output<List<FolderContactNotificationCategorySubscriptionsItem>>> notificationCategorySubscriptions() {
        return Optional.ofNullable(this.notificationCategorySubscriptions);
    }

    /**
     * The last time the validation_state was updated, either manually or automatically. A contact is considered stale if its validation state was updated more than 1 year ago.
     * 
     */
    @Import(name="validateTime")
    private @Nullable Output<String> validateTime;

    /**
     * @return The last time the validation_state was updated, either manually or automatically. A contact is considered stale if its validation state was updated more than 1 year ago.
     * 
     */
    public Optional<Output<String>> validateTime() {
        return Optional.ofNullable(this.validateTime);
    }

    /**
     * The validity of the contact. A contact is considered valid if it is the correct recipient for notifications for a particular resource.
     * 
     */
    @Import(name="validationState")
    private @Nullable Output<FolderContactValidationState> validationState;

    /**
     * @return The validity of the contact. A contact is considered valid if it is the correct recipient for notifications for a particular resource.
     * 
     */
    public Optional<Output<FolderContactValidationState>> validationState() {
        return Optional.ofNullable(this.validationState);
    }

    private FolderContactArgs() {}

    private FolderContactArgs(FolderContactArgs $) {
        this.email = $.email;
        this.folderId = $.folderId;
        this.languageTag = $.languageTag;
        this.name = $.name;
        this.notificationCategorySubscriptions = $.notificationCategorySubscriptions;
        this.validateTime = $.validateTime;
        this.validationState = $.validationState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderContactArgs $;

        public Builder() {
            $ = new FolderContactArgs();
        }

        public Builder(FolderContactArgs defaults) {
            $ = new FolderContactArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email The email address to send notifications to. This does not need to be a Google account.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email address to send notifications to. This does not need to be a Google account.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        public Builder folderId(Output<String> folderId) {
            $.folderId = folderId;
            return this;
        }

        public Builder folderId(String folderId) {
            return folderId(Output.of(folderId));
        }

        /**
         * @param languageTag The preferred language for notifications, as a ISO 639-1 language code. See [Supported languages](https://cloud.google.com/resource-manager/docs/managing-notification-contacts#supported-languages) for a list of supported languages.
         * 
         * @return builder
         * 
         */
        public Builder languageTag(@Nullable Output<String> languageTag) {
            $.languageTag = languageTag;
            return this;
        }

        /**
         * @param languageTag The preferred language for notifications, as a ISO 639-1 language code. See [Supported languages](https://cloud.google.com/resource-manager/docs/managing-notification-contacts#supported-languages) for a list of supported languages.
         * 
         * @return builder
         * 
         */
        public Builder languageTag(String languageTag) {
            return languageTag(Output.of(languageTag));
        }

        /**
         * @param name The identifier for the contact. Format: {resource_type}/{resource_id}/contacts/{contact_id}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The identifier for the contact. Format: {resource_type}/{resource_id}/contacts/{contact_id}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationCategorySubscriptions The categories of notifications that the contact will receive communications for.
         * 
         * @return builder
         * 
         */
        public Builder notificationCategorySubscriptions(@Nullable Output<List<FolderContactNotificationCategorySubscriptionsItem>> notificationCategorySubscriptions) {
            $.notificationCategorySubscriptions = notificationCategorySubscriptions;
            return this;
        }

        /**
         * @param notificationCategorySubscriptions The categories of notifications that the contact will receive communications for.
         * 
         * @return builder
         * 
         */
        public Builder notificationCategorySubscriptions(List<FolderContactNotificationCategorySubscriptionsItem> notificationCategorySubscriptions) {
            return notificationCategorySubscriptions(Output.of(notificationCategorySubscriptions));
        }

        /**
         * @param notificationCategorySubscriptions The categories of notifications that the contact will receive communications for.
         * 
         * @return builder
         * 
         */
        public Builder notificationCategorySubscriptions(FolderContactNotificationCategorySubscriptionsItem... notificationCategorySubscriptions) {
            return notificationCategorySubscriptions(List.of(notificationCategorySubscriptions));
        }

        /**
         * @param validateTime The last time the validation_state was updated, either manually or automatically. A contact is considered stale if its validation state was updated more than 1 year ago.
         * 
         * @return builder
         * 
         */
        public Builder validateTime(@Nullable Output<String> validateTime) {
            $.validateTime = validateTime;
            return this;
        }

        /**
         * @param validateTime The last time the validation_state was updated, either manually or automatically. A contact is considered stale if its validation state was updated more than 1 year ago.
         * 
         * @return builder
         * 
         */
        public Builder validateTime(String validateTime) {
            return validateTime(Output.of(validateTime));
        }

        /**
         * @param validationState The validity of the contact. A contact is considered valid if it is the correct recipient for notifications for a particular resource.
         * 
         * @return builder
         * 
         */
        public Builder validationState(@Nullable Output<FolderContactValidationState> validationState) {
            $.validationState = validationState;
            return this;
        }

        /**
         * @param validationState The validity of the contact. A contact is considered valid if it is the correct recipient for notifications for a particular resource.
         * 
         * @return builder
         * 
         */
        public Builder validationState(FolderContactValidationState validationState) {
            return validationState(Output.of(validationState));
        }

        public FolderContactArgs build() {
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            $.folderId = Objects.requireNonNull($.folderId, "expected parameter 'folderId' to be non-null");
            return $;
        }
    }

}
