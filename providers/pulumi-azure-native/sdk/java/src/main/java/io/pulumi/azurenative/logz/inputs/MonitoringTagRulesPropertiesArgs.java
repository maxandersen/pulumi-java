// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.azurenative.logz.inputs.LogRulesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of the properties for a TagRules resource.
 * 
 */
public final class MonitoringTagRulesPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringTagRulesPropertiesArgs Empty = new MonitoringTagRulesPropertiesArgs();

    /**
     * Set of rules for sending logs for the Monitor resource.
     * 
     */
    @Import(name="logRules")
      private final @Nullable Output<LogRulesArgs> logRules;

    public Output<LogRulesArgs> logRules() {
        return this.logRules == null ? Codegen.empty() : this.logRules;
    }

    public MonitoringTagRulesPropertiesArgs(@Nullable Output<LogRulesArgs> logRules) {
        this.logRules = logRules;
    }

    private MonitoringTagRulesPropertiesArgs() {
        this.logRules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringTagRulesPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LogRulesArgs> logRules;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringTagRulesPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logRules = defaults.logRules;
        }

        public Builder logRules(@Nullable Output<LogRulesArgs> logRules) {
            this.logRules = logRules;
            return this;
        }
        public Builder logRules(@Nullable LogRulesArgs logRules) {
            this.logRules = Codegen.ofNullable(logRules);
            return this;
        }        public MonitoringTagRulesPropertiesArgs build() {
            return new MonitoringTagRulesPropertiesArgs(logRules);
        }
    }
}
