// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.offazure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class for site properties.
 * 
 */
public final class SiteSpnPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SiteSpnPropertiesArgs Empty = new SiteSpnPropertiesArgs();

    /**
     * AAD Authority URL which was used to request the token for the service principal.
     * 
     */
    @Import(name="aadAuthority")
    private @Nullable Output<String> aadAuthority;

    public Optional<Output<String>> aadAuthority() {
        return Optional.ofNullable(this.aadAuthority);
    }

    /**
     * Application/client Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * Intended audience for the service principal.
     * 
     */
    @Import(name="audience")
    private @Nullable Output<String> audience;

    public Optional<Output<String>> audience() {
        return Optional.ofNullable(this.audience);
    }

    /**
     * Object Id of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @Import(name="objectId")
    private @Nullable Output<String> objectId;

    public Optional<Output<String>> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    /**
     * Raw certificate data for building certificate expiry flows.
     * 
     */
    @Import(name="rawCertData")
    private @Nullable Output<String> rawCertData;

    public Optional<Output<String>> rawCertData() {
        return Optional.ofNullable(this.rawCertData);
    }

    /**
     * Tenant Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private SiteSpnPropertiesArgs() {}

    private SiteSpnPropertiesArgs(SiteSpnPropertiesArgs $) {
        this.aadAuthority = $.aadAuthority;
        this.applicationId = $.applicationId;
        this.audience = $.audience;
        this.objectId = $.objectId;
        this.rawCertData = $.rawCertData;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SiteSpnPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SiteSpnPropertiesArgs $;

        public Builder() {
            $ = new SiteSpnPropertiesArgs();
        }

        public Builder(SiteSpnPropertiesArgs defaults) {
            $ = new SiteSpnPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder aadAuthority(@Nullable Output<String> aadAuthority) {
            $.aadAuthority = aadAuthority;
            return this;
        }

        public Builder aadAuthority(String aadAuthority) {
            return aadAuthority(Output.of(aadAuthority));
        }

        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        public Builder audience(@Nullable Output<String> audience) {
            $.audience = audience;
            return this;
        }

        public Builder audience(String audience) {
            return audience(Output.of(audience));
        }

        public Builder objectId(@Nullable Output<String> objectId) {
            $.objectId = objectId;
            return this;
        }

        public Builder objectId(String objectId) {
            return objectId(Output.of(objectId));
        }

        public Builder rawCertData(@Nullable Output<String> rawCertData) {
            $.rawCertData = rawCertData;
            return this;
        }

        public Builder rawCertData(String rawCertData) {
            return rawCertData(Output.of(rawCertData));
        }

        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public SiteSpnPropertiesArgs build() {
            return $;
        }
    }

}
