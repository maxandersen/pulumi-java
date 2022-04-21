// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.confidentialledger.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AAD based security principal with associated Ledger RoleName
 * 
 */
public final class AADBasedSecurityPrincipalResponse extends com.pulumi.resources.InvokeArgs {

    public static final AADBasedSecurityPrincipalResponse Empty = new AADBasedSecurityPrincipalResponse();

    /**
     * LedgerRole associated with the Security Principal of Ledger
     * 
     */
    @Import(name="ledgerRoleName")
    private @Nullable String ledgerRoleName;

    public Optional<String> ledgerRoleName() {
        return Optional.ofNullable(this.ledgerRoleName);
    }

    /**
     * UUID/GUID based Principal Id of the Security Principal
     * 
     */
    @Import(name="principalId")
    private @Nullable String principalId;

    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * UUID/GUID based Tenant Id of the Security Principal
     * 
     */
    @Import(name="tenantId")
    private @Nullable String tenantId;

    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private AADBasedSecurityPrincipalResponse() {}

    private AADBasedSecurityPrincipalResponse(AADBasedSecurityPrincipalResponse $) {
        this.ledgerRoleName = $.ledgerRoleName;
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AADBasedSecurityPrincipalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AADBasedSecurityPrincipalResponse $;

        public Builder() {
            $ = new AADBasedSecurityPrincipalResponse();
        }

        public Builder(AADBasedSecurityPrincipalResponse defaults) {
            $ = new AADBasedSecurityPrincipalResponse(Objects.requireNonNull(defaults));
        }

        public Builder ledgerRoleName(@Nullable String ledgerRoleName) {
            $.ledgerRoleName = ledgerRoleName;
            return this;
        }

        public Builder principalId(@Nullable String principalId) {
            $.principalId = principalId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public AADBasedSecurityPrincipalResponse build() {
            return $;
        }
    }

}
