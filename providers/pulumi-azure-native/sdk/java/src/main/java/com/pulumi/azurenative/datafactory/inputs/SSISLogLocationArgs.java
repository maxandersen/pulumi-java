// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.SsisLogLocationType;
import com.pulumi.azurenative.datafactory.inputs.SSISAccessCredentialArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SSIS package execution log location
 * 
 */
public final class SSISLogLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SSISLogLocationArgs Empty = new SSISLogLocationArgs();

    /**
     * The package execution log access credential.
     * 
     */
    @Import(name="accessCredential")
    private @Nullable Output<SSISAccessCredentialArgs> accessCredential;

    /**
     * @return The package execution log access credential.
     * 
     */
    public Optional<Output<SSISAccessCredentialArgs>> accessCredential() {
        return Optional.ofNullable(this.accessCredential);
    }

    /**
     * The SSIS package execution log path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="logPath", required=true)
    private Output<Object> logPath;

    /**
     * @return The SSIS package execution log path. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> logPath() {
        return this.logPath;
    }

    /**
     * Specifies the interval to refresh log. The default interval is 5 minutes. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="logRefreshInterval")
    private @Nullable Output<Object> logRefreshInterval;

    /**
     * @return Specifies the interval to refresh log. The default interval is 5 minutes. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> logRefreshInterval() {
        return Optional.ofNullable(this.logRefreshInterval);
    }

    /**
     * The type of SSIS log location.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,SsisLogLocationType>> type;

    /**
     * @return The type of SSIS log location.
     * 
     */
    public Output<Either<String,SsisLogLocationType>> type() {
        return this.type;
    }

    private SSISLogLocationArgs() {}

    private SSISLogLocationArgs(SSISLogLocationArgs $) {
        this.accessCredential = $.accessCredential;
        this.logPath = $.logPath;
        this.logRefreshInterval = $.logRefreshInterval;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SSISLogLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SSISLogLocationArgs $;

        public Builder() {
            $ = new SSISLogLocationArgs();
        }

        public Builder(SSISLogLocationArgs defaults) {
            $ = new SSISLogLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessCredential The package execution log access credential.
         * 
         * @return builder
         * 
         */
        public Builder accessCredential(@Nullable Output<SSISAccessCredentialArgs> accessCredential) {
            $.accessCredential = accessCredential;
            return this;
        }

        /**
         * @param accessCredential The package execution log access credential.
         * 
         * @return builder
         * 
         */
        public Builder accessCredential(SSISAccessCredentialArgs accessCredential) {
            return accessCredential(Output.of(accessCredential));
        }

        /**
         * @param logPath The SSIS package execution log path. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder logPath(Output<Object> logPath) {
            $.logPath = logPath;
            return this;
        }

        /**
         * @param logPath The SSIS package execution log path. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder logPath(Object logPath) {
            return logPath(Output.of(logPath));
        }

        /**
         * @param logRefreshInterval Specifies the interval to refresh log. The default interval is 5 minutes. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder logRefreshInterval(@Nullable Output<Object> logRefreshInterval) {
            $.logRefreshInterval = logRefreshInterval;
            return this;
        }

        /**
         * @param logRefreshInterval Specifies the interval to refresh log. The default interval is 5 minutes. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder logRefreshInterval(Object logRefreshInterval) {
            return logRefreshInterval(Output.of(logRefreshInterval));
        }

        /**
         * @param type The type of SSIS log location.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<Either<String,SsisLogLocationType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of SSIS log location.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,SsisLogLocationType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The type of SSIS log location.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The type of SSIS log location.
         * 
         * @return builder
         * 
         */
        public Builder type(SsisLogLocationType type) {
            return type(Either.ofRight(type));
        }

        public SSISLogLocationArgs build() {
            $.logPath = Objects.requireNonNull($.logPath, "expected parameter 'logPath' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
