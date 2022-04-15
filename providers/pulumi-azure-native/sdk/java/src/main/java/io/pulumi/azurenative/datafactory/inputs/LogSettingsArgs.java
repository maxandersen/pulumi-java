// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.CopyActivityLogSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.LogLocationSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Log settings.
 * 
 */
public final class LogSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogSettingsArgs Empty = new LogSettingsArgs();

    /**
     * Specifies settings for copy activity log.
     * 
     */
    @Import(name="copyActivityLogSettings")
      private final @Nullable Output<CopyActivityLogSettingsArgs> copyActivityLogSettings;

    public Output<CopyActivityLogSettingsArgs> copyActivityLogSettings() {
        return this.copyActivityLogSettings == null ? Codegen.empty() : this.copyActivityLogSettings;
    }

    /**
     * Specifies whether to enable copy activity log. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="enableCopyActivityLog")
      private final @Nullable Output<Object> enableCopyActivityLog;

    public Output<Object> enableCopyActivityLog() {
        return this.enableCopyActivityLog == null ? Codegen.empty() : this.enableCopyActivityLog;
    }

    /**
     * Log location settings customer needs to provide when enabling log.
     * 
     */
    @Import(name="logLocationSettings", required=true)
      private final Output<LogLocationSettingsArgs> logLocationSettings;

    public Output<LogLocationSettingsArgs> logLocationSettings() {
        return this.logLocationSettings;
    }

    public LogSettingsArgs(
        @Nullable Output<CopyActivityLogSettingsArgs> copyActivityLogSettings,
        @Nullable Output<Object> enableCopyActivityLog,
        Output<LogLocationSettingsArgs> logLocationSettings) {
        this.copyActivityLogSettings = copyActivityLogSettings;
        this.enableCopyActivityLog = enableCopyActivityLog;
        this.logLocationSettings = Objects.requireNonNull(logLocationSettings, "expected parameter 'logLocationSettings' to be non-null");
    }

    private LogSettingsArgs() {
        this.copyActivityLogSettings = Codegen.empty();
        this.enableCopyActivityLog = Codegen.empty();
        this.logLocationSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CopyActivityLogSettingsArgs> copyActivityLogSettings;
        private @Nullable Output<Object> enableCopyActivityLog;
        private Output<LogLocationSettingsArgs> logLocationSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(LogSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyActivityLogSettings = defaults.copyActivityLogSettings;
    	      this.enableCopyActivityLog = defaults.enableCopyActivityLog;
    	      this.logLocationSettings = defaults.logLocationSettings;
        }

        public Builder copyActivityLogSettings(@Nullable Output<CopyActivityLogSettingsArgs> copyActivityLogSettings) {
            this.copyActivityLogSettings = copyActivityLogSettings;
            return this;
        }
        public Builder copyActivityLogSettings(@Nullable CopyActivityLogSettingsArgs copyActivityLogSettings) {
            this.copyActivityLogSettings = Codegen.ofNullable(copyActivityLogSettings);
            return this;
        }
        public Builder enableCopyActivityLog(@Nullable Output<Object> enableCopyActivityLog) {
            this.enableCopyActivityLog = enableCopyActivityLog;
            return this;
        }
        public Builder enableCopyActivityLog(@Nullable Object enableCopyActivityLog) {
            this.enableCopyActivityLog = Codegen.ofNullable(enableCopyActivityLog);
            return this;
        }
        public Builder logLocationSettings(Output<LogLocationSettingsArgs> logLocationSettings) {
            this.logLocationSettings = Objects.requireNonNull(logLocationSettings);
            return this;
        }
        public Builder logLocationSettings(LogLocationSettingsArgs logLocationSettings) {
            this.logLocationSettings = Output.of(Objects.requireNonNull(logLocationSettings));
            return this;
        }        public LogSettingsArgs build() {
            return new LogSettingsArgs(copyActivityLogSettings, enableCopyActivityLog, logLocationSettings);
        }
    }
}
