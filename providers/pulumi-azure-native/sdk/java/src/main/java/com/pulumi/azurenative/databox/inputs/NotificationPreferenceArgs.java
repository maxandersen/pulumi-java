// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.enums.NotificationStageName;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Notification preference for a job stage.
 * 
 */
public final class NotificationPreferenceArgs extends ResourceArgs {

    public static final NotificationPreferenceArgs Empty = new NotificationPreferenceArgs();

    /**
     * Notification is required or not.
     * 
     */
    @Import(name="sendNotification", required=true)
    private Output<Boolean> sendNotification;

    /**
     * @return Notification is required or not.
     * 
     */
    public Output<Boolean> sendNotification() {
        return this.sendNotification;
    }

    /**
     * Name of the stage.
     * 
     */
    @Import(name="stageName", required=true)
    private Output<Either<String,NotificationStageName>> stageName;

    /**
     * @return Name of the stage.
     * 
     */
    public Output<Either<String,NotificationStageName>> stageName() {
        return this.stageName;
    }

    private NotificationPreferenceArgs() {}

    private NotificationPreferenceArgs(NotificationPreferenceArgs $) {
        this.sendNotification = $.sendNotification;
        this.stageName = $.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationPreferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationPreferenceArgs $;

        public Builder() {
            $ = new NotificationPreferenceArgs();
        }

        public Builder(NotificationPreferenceArgs defaults) {
            $ = new NotificationPreferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sendNotification Notification is required or not.
         * 
         * @return builder
         * 
         */
        public Builder sendNotification(Output<Boolean> sendNotification) {
            $.sendNotification = sendNotification;
            return this;
        }

        /**
         * @param sendNotification Notification is required or not.
         * 
         * @return builder
         * 
         */
        public Builder sendNotification(Boolean sendNotification) {
            return sendNotification(Output.of(sendNotification));
        }

        /**
         * @param stageName Name of the stage.
         * 
         * @return builder
         * 
         */
        public Builder stageName(Output<Either<String,NotificationStageName>> stageName) {
            $.stageName = stageName;
            return this;
        }

        /**
         * @param stageName Name of the stage.
         * 
         * @return builder
         * 
         */
        public Builder stageName(Either<String,NotificationStageName> stageName) {
            return stageName(Output.of(stageName));
        }

        /**
         * @param stageName Name of the stage.
         * 
         * @return builder
         * 
         */
        public Builder stageName(String stageName) {
            return stageName(Either.ofLeft(stageName));
        }

        /**
         * @param stageName Name of the stage.
         * 
         * @return builder
         * 
         */
        public Builder stageName(NotificationStageName stageName) {
            return stageName(Either.ofRight(stageName));
        }

        public NotificationPreferenceArgs build() {
            $.sendNotification = Codegen.booleanProp("sendNotification").output().arg($.sendNotification).def(true).require();
            $.stageName = Objects.requireNonNull($.stageName, "expected parameter 'stageName' to be non-null");
            return $;
        }
    }

}
