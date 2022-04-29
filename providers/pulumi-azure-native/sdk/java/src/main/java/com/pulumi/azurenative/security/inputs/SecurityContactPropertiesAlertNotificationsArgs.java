// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.enums.MinimalSeverity;
import com.pulumi.azurenative.security.enums.State;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines whether to send email notifications about new security alerts
 * 
 */
public final class SecurityContactPropertiesAlertNotificationsArgs extends ResourceArgs {

    public static final SecurityContactPropertiesAlertNotificationsArgs Empty = new SecurityContactPropertiesAlertNotificationsArgs();

    /**
     * Defines the minimal alert severity which will be sent as email notifications
     * 
     */
    @Import(name="minimalSeverity")
    private @Nullable Output<Either<String,MinimalSeverity>> minimalSeverity;

    /**
     * @return Defines the minimal alert severity which will be sent as email notifications
     * 
     */
    public Optional<Output<Either<String,MinimalSeverity>>> minimalSeverity() {
        return Optional.ofNullable(this.minimalSeverity);
    }

    /**
     * Defines if email notifications will be sent about new security alerts
     * 
     */
    @Import(name="state")
    private @Nullable Output<Either<String,State>> state;

    /**
     * @return Defines if email notifications will be sent about new security alerts
     * 
     */
    public Optional<Output<Either<String,State>>> state() {
        return Optional.ofNullable(this.state);
    }

    private SecurityContactPropertiesAlertNotificationsArgs() {}

    private SecurityContactPropertiesAlertNotificationsArgs(SecurityContactPropertiesAlertNotificationsArgs $) {
        this.minimalSeverity = $.minimalSeverity;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityContactPropertiesAlertNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityContactPropertiesAlertNotificationsArgs $;

        public Builder() {
            $ = new SecurityContactPropertiesAlertNotificationsArgs();
        }

        public Builder(SecurityContactPropertiesAlertNotificationsArgs defaults) {
            $ = new SecurityContactPropertiesAlertNotificationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minimalSeverity Defines the minimal alert severity which will be sent as email notifications
         * 
         * @return builder
         * 
         */
        public Builder minimalSeverity(@Nullable Output<Either<String,MinimalSeverity>> minimalSeverity) {
            $.minimalSeverity = minimalSeverity;
            return this;
        }

        /**
         * @param minimalSeverity Defines the minimal alert severity which will be sent as email notifications
         * 
         * @return builder
         * 
         */
        public Builder minimalSeverity(Either<String,MinimalSeverity> minimalSeverity) {
            return minimalSeverity(Output.of(minimalSeverity));
        }

        /**
         * @param minimalSeverity Defines the minimal alert severity which will be sent as email notifications
         * 
         * @return builder
         * 
         */
        public Builder minimalSeverity(String minimalSeverity) {
            return minimalSeverity(Either.ofLeft(minimalSeverity));
        }

        /**
         * @param minimalSeverity Defines the minimal alert severity which will be sent as email notifications
         * 
         * @return builder
         * 
         */
        public Builder minimalSeverity(MinimalSeverity minimalSeverity) {
            return minimalSeverity(Either.ofRight(minimalSeverity));
        }

        /**
         * @param state Defines if email notifications will be sent about new security alerts
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<Either<String,State>> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Defines if email notifications will be sent about new security alerts
         * 
         * @return builder
         * 
         */
        public Builder state(Either<String,State> state) {
            return state(Output.of(state));
        }

        /**
         * @param state Defines if email notifications will be sent about new security alerts
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Either.ofLeft(state));
        }

        /**
         * @param state Defines if email notifications will be sent about new security alerts
         * 
         * @return builder
         * 
         */
        public Builder state(State state) {
            return state(Either.ofRight(state));
        }

        public SecurityContactPropertiesAlertNotificationsArgs build() {
            return $;
        }
    }

}
