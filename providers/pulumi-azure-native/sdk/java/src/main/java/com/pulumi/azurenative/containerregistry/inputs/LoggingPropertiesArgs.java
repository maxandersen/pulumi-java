// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.AuditLogStatus;
import com.pulumi.azurenative.containerregistry.enums.LogLevel;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The logging properties of the connected registry.
 * 
 */
public final class LoggingPropertiesArgs extends ResourceArgs {

    public static final LoggingPropertiesArgs Empty = new LoggingPropertiesArgs();

    /**
     * Indicates whether audit logs are enabled on the connected registry.
     * 
     */
    @Import(name="auditLogStatus")
    private @Nullable Output<Either<String,AuditLogStatus>> auditLogStatus;

    /**
     * @return Indicates whether audit logs are enabled on the connected registry.
     * 
     */
    public Optional<Output<Either<String,AuditLogStatus>>> auditLogStatus() {
        return Optional.ofNullable(this.auditLogStatus);
    }

    /**
     * The verbosity of logs persisted on the connected registry.
     * 
     */
    @Import(name="logLevel")
    private @Nullable Output<Either<String,LogLevel>> logLevel;

    /**
     * @return The verbosity of logs persisted on the connected registry.
     * 
     */
    public Optional<Output<Either<String,LogLevel>>> logLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    private LoggingPropertiesArgs() {}

    private LoggingPropertiesArgs(LoggingPropertiesArgs $) {
        this.auditLogStatus = $.auditLogStatus;
        this.logLevel = $.logLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingPropertiesArgs $;

        public Builder() {
            $ = new LoggingPropertiesArgs();
        }

        public Builder(LoggingPropertiesArgs defaults) {
            $ = new LoggingPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditLogStatus Indicates whether audit logs are enabled on the connected registry.
         * 
         * @return builder
         * 
         */
        public Builder auditLogStatus(@Nullable Output<Either<String,AuditLogStatus>> auditLogStatus) {
            $.auditLogStatus = auditLogStatus;
            return this;
        }

        /**
         * @param auditLogStatus Indicates whether audit logs are enabled on the connected registry.
         * 
         * @return builder
         * 
         */
        public Builder auditLogStatus(Either<String,AuditLogStatus> auditLogStatus) {
            return auditLogStatus(Output.of(auditLogStatus));
        }

        /**
         * @param auditLogStatus Indicates whether audit logs are enabled on the connected registry.
         * 
         * @return builder
         * 
         */
        public Builder auditLogStatus(String auditLogStatus) {
            return auditLogStatus(Either.ofLeft(auditLogStatus));
        }

        /**
         * @param auditLogStatus Indicates whether audit logs are enabled on the connected registry.
         * 
         * @return builder
         * 
         */
        public Builder auditLogStatus(AuditLogStatus auditLogStatus) {
            return auditLogStatus(Either.ofRight(auditLogStatus));
        }

        /**
         * @param logLevel The verbosity of logs persisted on the connected registry.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(@Nullable Output<Either<String,LogLevel>> logLevel) {
            $.logLevel = logLevel;
            return this;
        }

        /**
         * @param logLevel The verbosity of logs persisted on the connected registry.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(Either<String,LogLevel> logLevel) {
            return logLevel(Output.of(logLevel));
        }

        /**
         * @param logLevel The verbosity of logs persisted on the connected registry.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(String logLevel) {
            return logLevel(Either.ofLeft(logLevel));
        }

        /**
         * @param logLevel The verbosity of logs persisted on the connected registry.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(LogLevel logLevel) {
            return logLevel(Either.ofRight(logLevel));
        }

        public LoggingPropertiesArgs build() {
            $.auditLogStatus = Codegen.stringProp("auditLogStatus").left(AuditLogStatus.class).output().arg($.auditLogStatus).def("Disabled").getNullable();
            $.logLevel = Codegen.stringProp("logLevel").left(LogLevel.class).output().arg($.logLevel).def("Information").getNullable();
            return $;
        }
    }

}
