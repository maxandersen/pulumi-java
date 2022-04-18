// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Trusted attributes supplied by the IAM system.
     * 
     */
    @EnumType
    public enum ConditionIam {
        /**
         * Default non-attribute.
         * 
         */
        NoAttr("NO_ATTR"),
        /**
         * Either principal or (if present) authority selector.
         * 
         */
        Authority("AUTHORITY"),
        /**
         * The principal (even if an authority selector is present), which must only be used for attribution, not authorization.
         * 
         */
        Attribution("ATTRIBUTION"),
        /**
         * Any of the security realms in the IAMContext (go/security-realms). When used with IN, the condition indicates "any of the request's realms match one of the given values; with NOT_IN, "none of the realms match any of the given values". Note that a value can be: - 'self' (i.e., allow connections from clients that are in the same security realm, which is currently but not guaranteed to be campus-sized) - 'self:metro' (i.e., clients that are in the same metro) - 'self:cloud-region' (i.e., allow connections from clients that are in the same cloud region) - 'self:prod-region' (i.e., allow connections from clients that are in the same prod region) - 'guardians' (i.e., allow connections from its guardian realms. See go/security-realms-glossary#guardian for more information.) - a realm (e.g., 'campus-abc') - a realm group (e.g., 'realms-for-borg-cell-xx', see: go/realm-groups) A match is determined by a realm group membership check performed by a RealmAclRep object (go/realm-acl-howto). It is not permitted to grant access based on the *absence* of a realm, so realm conditions can only be used in a "positive" context (e.g., ALLOW/IN or DENY/NOT_IN).
         * 
         */
        SecurityRealm("SECURITY_REALM"),
        /**
         * An approver (distinct from the requester) that has authorized this request. When used with IN, the condition indicates that one of the approvers associated with the request matches the specified principal, or is a member of the specified group. Approvers can only grant additional access, and are thus only used in a strictly positive context (e.g. ALLOW/IN or DENY/NOT_IN).
         * 
         */
        Approver("APPROVER"),
        /**
         * What types of justifications have been supplied with this request. String values should match enum names from security.credentials.JustificationType, e.g. "MANUAL_STRING". It is not permitted to grant access based on the *absence* of a justification, so justification conditions can only be used in a "positive" context (e.g., ALLOW/IN or DENY/NOT_IN). Multiple justifications, e.g., a Buganizer ID and a manually-entered reason, are normal and supported.
         * 
         */
        JustificationType("JUSTIFICATION_TYPE"),
        /**
         * What type of credentials have been supplied with this request. String values should match enum names from security_loas_l2.CredentialsType - currently, only CREDS_TYPE_EMERGENCY is supported. It is not permitted to grant access based on the *absence* of a credentials type, so the conditions can only be used in a "positive" context (e.g., ALLOW/IN or DENY/NOT_IN).
         * 
         */
        CredentialsType("CREDENTIALS_TYPE"),
        /**
         * EXPERIMENTAL -- DO NOT USE. The conditions can only be used in a "positive" context (e.g., ALLOW/IN or DENY/NOT_IN).
         * 
         */
        CredsAssertion("CREDS_ASSERTION");

        private final String value;

        ConditionIam(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConditionIam[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
