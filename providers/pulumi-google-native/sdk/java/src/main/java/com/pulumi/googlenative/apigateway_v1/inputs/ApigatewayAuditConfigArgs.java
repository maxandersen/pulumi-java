// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.apigateway_v1.inputs.ApigatewayAuditLogConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the audit configuration for a service. The configuration determines which permission types are logged, and what identities, if any, are exempted from logging. An AuditConfig must have one or more AuditLogConfigs. If there are AuditConfigs for both `allServices` and a specific service, the union of the two AuditConfigs is used for that service: the log_types specified in each AuditConfig are enabled, and the exempted_members in each AuditLogConfig are exempted. Example Policy with multiple AuditConfigs: { &#34;audit_configs&#34;: [ { &#34;service&#34;: &#34;allServices&#34;, &#34;audit_log_configs&#34;: [ { &#34;log_type&#34;: &#34;DATA_READ&#34;, &#34;exempted_members&#34;: [ &#34;user:jose@example.com&#34; ] }, { &#34;log_type&#34;: &#34;DATA_WRITE&#34; }, { &#34;log_type&#34;: &#34;ADMIN_READ&#34; } ] }, { &#34;service&#34;: &#34;sampleservice.googleapis.com&#34;, &#34;audit_log_configs&#34;: [ { &#34;log_type&#34;: &#34;DATA_READ&#34; }, { &#34;log_type&#34;: &#34;DATA_WRITE&#34;, &#34;exempted_members&#34;: [ &#34;user:aliya@example.com&#34; ] } ] } ] } For sampleservice, this policy enables DATA_READ, DATA_WRITE and ADMIN_READ logging. It also exempts jose@example.com from DATA_READ logging, and aliya@example.com from DATA_WRITE logging.
 * 
 */
public final class ApigatewayAuditConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApigatewayAuditConfigArgs Empty = new ApigatewayAuditConfigArgs();

    /**
     * The configuration for logging of each type of permission.
     * 
     */
    @Import(name="auditLogConfigs")
      private final @Nullable Output<List<ApigatewayAuditLogConfigArgs>> auditLogConfigs;

    public Output<List<ApigatewayAuditLogConfigArgs>> auditLogConfigs() {
        return this.auditLogConfigs == null ? Codegen.empty() : this.auditLogConfigs;
    }

    /**
     * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> service() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    public ApigatewayAuditConfigArgs(
        @Nullable Output<List<ApigatewayAuditLogConfigArgs>> auditLogConfigs,
        @Nullable Output<String> service) {
        this.auditLogConfigs = auditLogConfigs;
        this.service = service;
    }

    private ApigatewayAuditConfigArgs() {
        this.auditLogConfigs = Codegen.empty();
        this.service = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayAuditConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ApigatewayAuditLogConfigArgs>> auditLogConfigs;
        private @Nullable Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayAuditConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.service = defaults.service;
        }

        public Builder auditLogConfigs(@Nullable Output<List<ApigatewayAuditLogConfigArgs>> auditLogConfigs) {
            this.auditLogConfigs = auditLogConfigs;
            return this;
        }
        public Builder auditLogConfigs(@Nullable List<ApigatewayAuditLogConfigArgs> auditLogConfigs) {
            this.auditLogConfigs = Codegen.ofNullable(auditLogConfigs);
            return this;
        }
        public Builder auditLogConfigs(ApigatewayAuditLogConfigArgs... auditLogConfigs) {
            return auditLogConfigs(List.of(auditLogConfigs));
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }        public ApigatewayAuditConfigArgs build() {
            return new ApigatewayAuditConfigArgs(auditLogConfigs, service);
        }
    }
}
