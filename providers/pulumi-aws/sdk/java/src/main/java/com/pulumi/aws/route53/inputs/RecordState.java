// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.aws.route53.enums.RecordType;
import com.pulumi.aws.route53.inputs.RecordAliasGetArgs;
import com.pulumi.aws.route53.inputs.RecordFailoverRoutingPolicyGetArgs;
import com.pulumi.aws.route53.inputs.RecordGeolocationRoutingPolicyGetArgs;
import com.pulumi.aws.route53.inputs.RecordLatencyRoutingPolicyGetArgs;
import com.pulumi.aws.route53.inputs.RecordWeightedRoutingPolicyGetArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecordState extends com.pulumi.resources.ResourceArgs {

    public static final RecordState Empty = new RecordState();

    /**
     * An alias block. Conflicts with `ttl` &amp; `records`.
     * Alias record documented below.
     * 
     */
    @Import(name="aliases")
      private final @Nullable Output<List<RecordAliasGetArgs>> aliases;

    public Output<List<RecordAliasGetArgs>> aliases() {
        return this.aliases == null ? Codegen.empty() : this.aliases;
    }

    /**
     * Allow creation of this record to overwrite an existing record, if any. This does not affect the ability to update the record using this provider and does not prevent other resources within this provider or manual Route 53 changes outside this provider from overwriting this record. `false` by default. This configuration is not recommended for most environments.
     * 
     */
    @Import(name="allowOverwrite")
      private final @Nullable Output<Boolean> allowOverwrite;

    public Output<Boolean> allowOverwrite() {
        return this.allowOverwrite == null ? Codegen.empty() : this.allowOverwrite;
    }

    /**
     * A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
     * 
     */
    @Import(name="failoverRoutingPolicies")
      private final @Nullable Output<List<RecordFailoverRoutingPolicyGetArgs>> failoverRoutingPolicies;

    public Output<List<RecordFailoverRoutingPolicyGetArgs>> failoverRoutingPolicies() {
        return this.failoverRoutingPolicies == null ? Codegen.empty() : this.failoverRoutingPolicies;
    }

    /**
     * [FQDN](https://en.wikipedia.org/wiki/Fully_qualified_domain_name) built using the zone domain and `name`.
     * 
     */
    @Import(name="fqdn")
      private final @Nullable Output<String> fqdn;

    public Output<String> fqdn() {
        return this.fqdn == null ? Codegen.empty() : this.fqdn;
    }

    /**
     * A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
     * 
     */
    @Import(name="geolocationRoutingPolicies")
      private final @Nullable Output<List<RecordGeolocationRoutingPolicyGetArgs>> geolocationRoutingPolicies;

    public Output<List<RecordGeolocationRoutingPolicyGetArgs>> geolocationRoutingPolicies() {
        return this.geolocationRoutingPolicies == null ? Codegen.empty() : this.geolocationRoutingPolicies;
    }

    /**
     * The health check the record should be associated with.
     * 
     */
    @Import(name="healthCheckId")
      private final @Nullable Output<String> healthCheckId;

    public Output<String> healthCheckId() {
        return this.healthCheckId == null ? Codegen.empty() : this.healthCheckId;
    }

    /**
     * A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
     * 
     */
    @Import(name="latencyRoutingPolicies")
      private final @Nullable Output<List<RecordLatencyRoutingPolicyGetArgs>> latencyRoutingPolicies;

    public Output<List<RecordLatencyRoutingPolicyGetArgs>> latencyRoutingPolicies() {
        return this.latencyRoutingPolicies == null ? Codegen.empty() : this.latencyRoutingPolicies;
    }

    /**
     * Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
     * 
     */
    @Import(name="multivalueAnswerRoutingPolicy")
      private final @Nullable Output<Boolean> multivalueAnswerRoutingPolicy;

    public Output<Boolean> multivalueAnswerRoutingPolicy() {
        return this.multivalueAnswerRoutingPolicy == null ? Codegen.empty() : this.multivalueAnswerRoutingPolicy;
    }

    /**
     * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A string list of records. To specify a single record value longer than 255 characters such as a TXT record for DKIM, add `\&#34;\&#34;` inside the configuration string (e.g. `&#34;first255characters\&#34;\&#34;morecharacters&#34;`).
     * 
     */
    @Import(name="records")
      private final @Nullable Output<List<String>> records;

    public Output<List<String>> records() {
        return this.records == null ? Codegen.empty() : this.records;
    }

    /**
     * Unique identifier to differentiate records with routing policies from one another. Required if using `failover`, `geolocation`, `latency`, or `weighted` routing policies documented below.
     * 
     */
    @Import(name="setIdentifier")
      private final @Nullable Output<String> setIdentifier;

    public Output<String> setIdentifier() {
        return this.setIdentifier == null ? Codegen.empty() : this.setIdentifier;
    }

    /**
     * The TTL of the record.
     * 
     */
    @Import(name="ttl")
      private final @Nullable Output<Integer> ttl;

    public Output<Integer> ttl() {
        return this.ttl == null ? Codegen.empty() : this.ttl;
    }

    /**
     * `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,RecordType>> type;

    public Output<Either<String,RecordType>> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
     * 
     */
    @Import(name="weightedRoutingPolicies")
      private final @Nullable Output<List<RecordWeightedRoutingPolicyGetArgs>> weightedRoutingPolicies;

    public Output<List<RecordWeightedRoutingPolicyGetArgs>> weightedRoutingPolicies() {
        return this.weightedRoutingPolicies == null ? Codegen.empty() : this.weightedRoutingPolicies;
    }

    /**
     * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See `resource_elb.zone_id` for example.
     * 
     */
    @Import(name="zoneId")
      private final @Nullable Output<String> zoneId;

    public Output<String> zoneId() {
        return this.zoneId == null ? Codegen.empty() : this.zoneId;
    }

    public RecordState(
        @Nullable Output<List<RecordAliasGetArgs>> aliases,
        @Nullable Output<Boolean> allowOverwrite,
        @Nullable Output<List<RecordFailoverRoutingPolicyGetArgs>> failoverRoutingPolicies,
        @Nullable Output<String> fqdn,
        @Nullable Output<List<RecordGeolocationRoutingPolicyGetArgs>> geolocationRoutingPolicies,
        @Nullable Output<String> healthCheckId,
        @Nullable Output<List<RecordLatencyRoutingPolicyGetArgs>> latencyRoutingPolicies,
        @Nullable Output<Boolean> multivalueAnswerRoutingPolicy,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> records,
        @Nullable Output<String> setIdentifier,
        @Nullable Output<Integer> ttl,
        @Nullable Output<Either<String,RecordType>> type,
        @Nullable Output<List<RecordWeightedRoutingPolicyGetArgs>> weightedRoutingPolicies,
        @Nullable Output<String> zoneId) {
        this.aliases = aliases;
        this.allowOverwrite = allowOverwrite;
        this.failoverRoutingPolicies = failoverRoutingPolicies;
        this.fqdn = fqdn;
        this.geolocationRoutingPolicies = geolocationRoutingPolicies;
        this.healthCheckId = healthCheckId;
        this.latencyRoutingPolicies = latencyRoutingPolicies;
        this.multivalueAnswerRoutingPolicy = multivalueAnswerRoutingPolicy;
        this.name = name;
        this.records = records;
        this.setIdentifier = setIdentifier;
        this.ttl = ttl;
        this.type = type;
        this.weightedRoutingPolicies = weightedRoutingPolicies;
        this.zoneId = zoneId;
    }

    private RecordState() {
        this.aliases = Codegen.empty();
        this.allowOverwrite = Codegen.empty();
        this.failoverRoutingPolicies = Codegen.empty();
        this.fqdn = Codegen.empty();
        this.geolocationRoutingPolicies = Codegen.empty();
        this.healthCheckId = Codegen.empty();
        this.latencyRoutingPolicies = Codegen.empty();
        this.multivalueAnswerRoutingPolicy = Codegen.empty();
        this.name = Codegen.empty();
        this.records = Codegen.empty();
        this.setIdentifier = Codegen.empty();
        this.ttl = Codegen.empty();
        this.type = Codegen.empty();
        this.weightedRoutingPolicies = Codegen.empty();
        this.zoneId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RecordAliasGetArgs>> aliases;
        private @Nullable Output<Boolean> allowOverwrite;
        private @Nullable Output<List<RecordFailoverRoutingPolicyGetArgs>> failoverRoutingPolicies;
        private @Nullable Output<String> fqdn;
        private @Nullable Output<List<RecordGeolocationRoutingPolicyGetArgs>> geolocationRoutingPolicies;
        private @Nullable Output<String> healthCheckId;
        private @Nullable Output<List<RecordLatencyRoutingPolicyGetArgs>> latencyRoutingPolicies;
        private @Nullable Output<Boolean> multivalueAnswerRoutingPolicy;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> records;
        private @Nullable Output<String> setIdentifier;
        private @Nullable Output<Integer> ttl;
        private @Nullable Output<Either<String,RecordType>> type;
        private @Nullable Output<List<RecordWeightedRoutingPolicyGetArgs>> weightedRoutingPolicies;
        private @Nullable Output<String> zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.allowOverwrite = defaults.allowOverwrite;
    	      this.failoverRoutingPolicies = defaults.failoverRoutingPolicies;
    	      this.fqdn = defaults.fqdn;
    	      this.geolocationRoutingPolicies = defaults.geolocationRoutingPolicies;
    	      this.healthCheckId = defaults.healthCheckId;
    	      this.latencyRoutingPolicies = defaults.latencyRoutingPolicies;
    	      this.multivalueAnswerRoutingPolicy = defaults.multivalueAnswerRoutingPolicy;
    	      this.name = defaults.name;
    	      this.records = defaults.records;
    	      this.setIdentifier = defaults.setIdentifier;
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
    	      this.weightedRoutingPolicies = defaults.weightedRoutingPolicies;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder aliases(@Nullable Output<List<RecordAliasGetArgs>> aliases) {
            this.aliases = aliases;
            return this;
        }
        public Builder aliases(@Nullable List<RecordAliasGetArgs> aliases) {
            this.aliases = Codegen.ofNullable(aliases);
            return this;
        }
        public Builder aliases(RecordAliasGetArgs... aliases) {
            return aliases(List.of(aliases));
        }
        public Builder allowOverwrite(@Nullable Output<Boolean> allowOverwrite) {
            this.allowOverwrite = allowOverwrite;
            return this;
        }
        public Builder allowOverwrite(@Nullable Boolean allowOverwrite) {
            this.allowOverwrite = Codegen.ofNullable(allowOverwrite);
            return this;
        }
        public Builder failoverRoutingPolicies(@Nullable Output<List<RecordFailoverRoutingPolicyGetArgs>> failoverRoutingPolicies) {
            this.failoverRoutingPolicies = failoverRoutingPolicies;
            return this;
        }
        public Builder failoverRoutingPolicies(@Nullable List<RecordFailoverRoutingPolicyGetArgs> failoverRoutingPolicies) {
            this.failoverRoutingPolicies = Codegen.ofNullable(failoverRoutingPolicies);
            return this;
        }
        public Builder failoverRoutingPolicies(RecordFailoverRoutingPolicyGetArgs... failoverRoutingPolicies) {
            return failoverRoutingPolicies(List.of(failoverRoutingPolicies));
        }
        public Builder fqdn(@Nullable Output<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }
        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = Codegen.ofNullable(fqdn);
            return this;
        }
        public Builder geolocationRoutingPolicies(@Nullable Output<List<RecordGeolocationRoutingPolicyGetArgs>> geolocationRoutingPolicies) {
            this.geolocationRoutingPolicies = geolocationRoutingPolicies;
            return this;
        }
        public Builder geolocationRoutingPolicies(@Nullable List<RecordGeolocationRoutingPolicyGetArgs> geolocationRoutingPolicies) {
            this.geolocationRoutingPolicies = Codegen.ofNullable(geolocationRoutingPolicies);
            return this;
        }
        public Builder geolocationRoutingPolicies(RecordGeolocationRoutingPolicyGetArgs... geolocationRoutingPolicies) {
            return geolocationRoutingPolicies(List.of(geolocationRoutingPolicies));
        }
        public Builder healthCheckId(@Nullable Output<String> healthCheckId) {
            this.healthCheckId = healthCheckId;
            return this;
        }
        public Builder healthCheckId(@Nullable String healthCheckId) {
            this.healthCheckId = Codegen.ofNullable(healthCheckId);
            return this;
        }
        public Builder latencyRoutingPolicies(@Nullable Output<List<RecordLatencyRoutingPolicyGetArgs>> latencyRoutingPolicies) {
            this.latencyRoutingPolicies = latencyRoutingPolicies;
            return this;
        }
        public Builder latencyRoutingPolicies(@Nullable List<RecordLatencyRoutingPolicyGetArgs> latencyRoutingPolicies) {
            this.latencyRoutingPolicies = Codegen.ofNullable(latencyRoutingPolicies);
            return this;
        }
        public Builder latencyRoutingPolicies(RecordLatencyRoutingPolicyGetArgs... latencyRoutingPolicies) {
            return latencyRoutingPolicies(List.of(latencyRoutingPolicies));
        }
        public Builder multivalueAnswerRoutingPolicy(@Nullable Output<Boolean> multivalueAnswerRoutingPolicy) {
            this.multivalueAnswerRoutingPolicy = multivalueAnswerRoutingPolicy;
            return this;
        }
        public Builder multivalueAnswerRoutingPolicy(@Nullable Boolean multivalueAnswerRoutingPolicy) {
            this.multivalueAnswerRoutingPolicy = Codegen.ofNullable(multivalueAnswerRoutingPolicy);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder records(@Nullable Output<List<String>> records) {
            this.records = records;
            return this;
        }
        public Builder records(@Nullable List<String> records) {
            this.records = Codegen.ofNullable(records);
            return this;
        }
        public Builder records(String... records) {
            return records(List.of(records));
        }
        public Builder setIdentifier(@Nullable Output<String> setIdentifier) {
            this.setIdentifier = setIdentifier;
            return this;
        }
        public Builder setIdentifier(@Nullable String setIdentifier) {
            this.setIdentifier = Codegen.ofNullable(setIdentifier);
            return this;
        }
        public Builder ttl(@Nullable Output<Integer> ttl) {
            this.ttl = ttl;
            return this;
        }
        public Builder ttl(@Nullable Integer ttl) {
            this.ttl = Codegen.ofNullable(ttl);
            return this;
        }
        public Builder type(@Nullable Output<Either<String,RecordType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,RecordType> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder weightedRoutingPolicies(@Nullable Output<List<RecordWeightedRoutingPolicyGetArgs>> weightedRoutingPolicies) {
            this.weightedRoutingPolicies = weightedRoutingPolicies;
            return this;
        }
        public Builder weightedRoutingPolicies(@Nullable List<RecordWeightedRoutingPolicyGetArgs> weightedRoutingPolicies) {
            this.weightedRoutingPolicies = Codegen.ofNullable(weightedRoutingPolicies);
            return this;
        }
        public Builder weightedRoutingPolicies(RecordWeightedRoutingPolicyGetArgs... weightedRoutingPolicies) {
            return weightedRoutingPolicies(List.of(weightedRoutingPolicies));
        }
        public Builder zoneId(@Nullable Output<String> zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = Codegen.ofNullable(zoneId);
            return this;
        }        public RecordState build() {
            return new RecordState(aliases, allowOverwrite, failoverRoutingPolicies, fqdn, geolocationRoutingPolicies, healthCheckId, latencyRoutingPolicies, multivalueAnswerRoutingPolicy, name, records, setIdentifier, ttl, type, weightedRoutingPolicies, zoneId);
        }
    }
}
