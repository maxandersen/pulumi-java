// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Usage configuration rules for the service. NOTE: Under development. Use this rule to configure unregistered calls for the service. Unregistered calls are calls that do not contain consumer project identity. (Example: calls that do not contain an API key). By default, API methods do not allow unregistered calls, and each method call must be identified by a consumer project identity. Use this rule to allow/disallow unregistered calls. Example of an API that wants to allow unregistered calls for entire service. usage: rules: - selector: &#34;*&#34; allow_unregistered_calls: true Example of a method that wants to allow unregistered calls. usage: rules: - selector: &#34;google.example.library.v1.LibraryService.CreateBook&#34; allow_unregistered_calls: true
 * 
 */
public final class UsageRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final UsageRuleArgs Empty = new UsageRuleArgs();

    /**
     * If true, the selected method allows unregistered calls, e.g. calls that don&#39;t identify any user or application.
     * 
     */
    @Import(name="allowUnregisteredCalls")
      private final @Nullable Output<Boolean> allowUnregisteredCalls;

    public Output<Boolean> allowUnregisteredCalls() {
        return this.allowUnregisteredCalls == null ? Codegen.empty() : this.allowUnregisteredCalls;
    }

    /**
     * Selects the methods to which this rule applies. Use &#39;*&#39; to indicate all methods in all APIs. Refer to selector for syntax details.
     * 
     */
    @Import(name="selector")
      private final @Nullable Output<String> selector;

    public Output<String> selector() {
        return this.selector == null ? Codegen.empty() : this.selector;
    }

    /**
     * If true, the selected method should skip service control and the control plane features, such as quota and billing, will not be available. This flag is used by Google Cloud Endpoints to bypass checks for internal methods, such as service health check methods.
     * 
     */
    @Import(name="skipServiceControl")
      private final @Nullable Output<Boolean> skipServiceControl;

    public Output<Boolean> skipServiceControl() {
        return this.skipServiceControl == null ? Codegen.empty() : this.skipServiceControl;
    }

    public UsageRuleArgs(
        @Nullable Output<Boolean> allowUnregisteredCalls,
        @Nullable Output<String> selector,
        @Nullable Output<Boolean> skipServiceControl) {
        this.allowUnregisteredCalls = allowUnregisteredCalls;
        this.selector = selector;
        this.skipServiceControl = skipServiceControl;
    }

    private UsageRuleArgs() {
        this.allowUnregisteredCalls = Codegen.empty();
        this.selector = Codegen.empty();
        this.skipServiceControl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsageRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowUnregisteredCalls;
        private @Nullable Output<String> selector;
        private @Nullable Output<Boolean> skipServiceControl;

        public Builder() {
    	      // Empty
        }

        public Builder(UsageRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowUnregisteredCalls = defaults.allowUnregisteredCalls;
    	      this.selector = defaults.selector;
    	      this.skipServiceControl = defaults.skipServiceControl;
        }

        public Builder allowUnregisteredCalls(@Nullable Output<Boolean> allowUnregisteredCalls) {
            this.allowUnregisteredCalls = allowUnregisteredCalls;
            return this;
        }
        public Builder allowUnregisteredCalls(@Nullable Boolean allowUnregisteredCalls) {
            this.allowUnregisteredCalls = Codegen.ofNullable(allowUnregisteredCalls);
            return this;
        }
        public Builder selector(@Nullable Output<String> selector) {
            this.selector = selector;
            return this;
        }
        public Builder selector(@Nullable String selector) {
            this.selector = Codegen.ofNullable(selector);
            return this;
        }
        public Builder skipServiceControl(@Nullable Output<Boolean> skipServiceControl) {
            this.skipServiceControl = skipServiceControl;
            return this;
        }
        public Builder skipServiceControl(@Nullable Boolean skipServiceControl) {
            this.skipServiceControl = Codegen.ofNullable(skipServiceControl);
            return this;
        }        public UsageRuleArgs build() {
            return new UsageRuleArgs(allowUnregisteredCalls, selector, skipServiceControl);
        }
    }
}
