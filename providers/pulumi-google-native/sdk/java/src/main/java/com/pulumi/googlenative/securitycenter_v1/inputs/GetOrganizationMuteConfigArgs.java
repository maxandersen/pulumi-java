// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.securitycenter_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationMuteConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationMuteConfigArgs Empty = new GetOrganizationMuteConfigArgs();

    @Import(name="muteConfigId", required=true)
    private String muteConfigId;

    public String muteConfigId() {
        return this.muteConfigId;
    }

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    private GetOrganizationMuteConfigArgs() {}

    private GetOrganizationMuteConfigArgs(GetOrganizationMuteConfigArgs $) {
        this.muteConfigId = $.muteConfigId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationMuteConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationMuteConfigArgs $;

        public Builder() {
            $ = new GetOrganizationMuteConfigArgs();
        }

        public Builder(GetOrganizationMuteConfigArgs defaults) {
            $ = new GetOrganizationMuteConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder muteConfigId(String muteConfigId) {
            $.muteConfigId = muteConfigId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetOrganizationMuteConfigArgs build() {
            $.muteConfigId = Objects.requireNonNull($.muteConfigId, "expected parameter 'muteConfigId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
