package travel_agency;

@FunctionalInterface
interface CommissionInfoProvider<T> {
     Double calculateCommissionAmount(Ticket ticketObj);
}
